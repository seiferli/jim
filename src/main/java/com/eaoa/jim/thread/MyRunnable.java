package com.eaoa.jim.thread;

/**
 * <p>实现Runnable接口，并重写该接口的run()方法</p>
 **/
public class MyRunnable {

    /**
     * 测试方法
     * @param args
     */
    public static void main(String[] args) {

        // 一般写法
        new MyRunnable().test();

        // 实战代码写法
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("实战代码写法，具体执行业务!");
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("实战代码写法，具体执行业务!");
            }
        }).start();

    }

    public void test(){
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 3) {
                // 创建一个Runnable实现类的对象
                Runnable myRunnableTest = new MyRunnableTest();
                // 将myRunnableTest作为Thread target创建新的线程
                Thread thread1 = new Thread(myRunnableTest);
                Thread thread2 = new Thread(myRunnableTest);
                // 调用start()方法使得线程进入就绪状态
                thread1.start();
                thread2.start();
            }
        }
    }

    class MyRunnableTest implements Runnable {
        private int i = 0;

        @Override
        public void run() {
            for (; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }
    }

}
