package com.eaoa.jim.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <p>通过线程池创建线程-无返回值</p>
 **/
public class MyExecutorRun {

    /**
     * 测试方法
     * @param args
     */
    public static void main(String[] args) {
        new MyExecutorRun().test();
    }

    //线程池数量
    private static int POOL_NUM = 10;

    public void test(){
        // 创建一个线程池
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for(int i = 0; i < POOL_NUM; i++) {
            Runnable r = new MyRunnable();
            // Thread.sleep(1000);
            // 执行任务
            executorService.execute(r);
        }
        //关闭线程池
        executorService.shutdown();
    }

    /**
     * 执行业务-无返回值
     */
    class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("通过线程池方式创建的线程：" + Thread.currentThread().getName() + " ");
        }
    }
}