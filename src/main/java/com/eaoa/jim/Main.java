package com.eaoa.jim;

import java.util.Timer;

public class Main {

    public static void main(String[] args) {

        byte[] b = new byte[10 * 1024 * 1024];
        System.out.println("分配了10M空间给数组");

        System.out.println("Xmx=" + Runtime.getRuntime().maxMemory() / 1024.0 / 1024 + "M");    //系统的最大空间
        System.out.println("free mem=" + Runtime.getRuntime().freeMemory() / 1024.0 / 1024 + "M");  //系统的空闲空间
        System.out.println("total mem=" + Runtime.getRuntime().totalMemory() / 1024.0 / 1024 + "M");  //当前可用的总空间

        System.out.println("Hello world!");
        Student student = new Student("tellUrDream");
        student.sayName();

        int[] is = student.randomNoSame(5, 10, 5);
        for (Integer i : is) {
            System.out.println(i);
        }

        try {
            student.genInt();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}