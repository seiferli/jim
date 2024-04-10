package com.eaoa.jim.filecopy;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;

public class FileCopy {

    public static void main(String[] args) {

        String basepath = "/apps/java/github/jim/src/main/java/com/eaoa/jim/filecopy/";
        File source = new File(basepath + "source.txt");

        try {
            // 使用流复制文件
            copyFileUsingStream(source, new File(basepath + "stream.txt"));
            // 使用 Files.copy 方法复制文件
            copyFileUsingFiles(source, new File(basepath + "files.txt"));
            // 使用通道复制文件
            copyFileUsingChannel(source, new File(basepath + "channel.txt"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            is.close();
            os.close();
        }
    }

    public static void copyFileUsingFiles(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath());
    }

    public static void copyFileUsingChannel(File source, File dest) throws IOException {
        FileChannel sourceChannel = null;
        FileChannel destChannel = null;
        try {
            sourceChannel = new FileInputStream(source).getChannel();
            destChannel = new FileOutputStream(dest).getChannel();
            destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
        } finally {
            sourceChannel.close();
            destChannel.close();
        }
    }

}
