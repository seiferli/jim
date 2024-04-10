package com.eaoa.jim.thread;

/**
 * <p>继承Thread类，重写该类的run()方法</p>
 **/
class MyThread {

    /**
     * 测试方法
     * @param args
     */
    public static void main(String[] args) {
        new MyThread().Test();
    }

    public void Test() {
        for (int i = 0; i < 10; i++) {
            System.out.println("test " + Thread.currentThread().getName() + " " + i);
            if (i == 3) {
                // 创建一个新的线程myThread1此线程进入新建状态
                Thread myThread1 = new MyThreadTest();
                // 创建一个新的线程myThread2此线程进入新建状态
                Thread myThread2 = new MyThreadTest();
                // 调用start()方法使得线程进入就绪状态
                myThread1.start();
                // 调用start()方法使得线程进入就绪状态
                myThread2.start();
            }
        }

    }

    class MyThreadTest extends Thread {
        private int i = 0;

        @Override
        public void run() {
            for (i = 0; i < 10; i++) {
                System.out.println("MyThreadTest " + Thread.currentThread().getName() + " " + i);
            }
        }
    }
}