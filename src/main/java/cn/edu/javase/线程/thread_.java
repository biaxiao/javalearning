package cn.edu.javase.线程;

import org.junit.Test;
import sun.applet.Main;

public class thread_ {
    //测试sleep
    @Test
   /* public void test2(){
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t1 run");
                try {
                    System.out.println("t1 --run");
                    Thread.sleep(5000);
                    System.out.println("t1 done");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println("main run");
        //主线程休眠。进入time waiting状态
        try {
            Thread.sleep(10000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.start();
        boolean daemon = t1.isDaemon();
        System.out.println(daemon);
       *//* try {
            Thread.sleep(10000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }*//*
        System.out.println("main done");
    }*/

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t1 run");
                try {
                    System.out.println("t1 --run");
                    Thread.sleep(5000);
                    System.out.println("t1 done");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println("main run");
        //主线程休眠。进入time waiting状态
        try {
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.start();
        boolean daemon = t1.isDaemon();
        System.out.println(daemon);
       /* try {
            Thread.sleep(10000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println("main done");
    }
}
