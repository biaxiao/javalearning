package cn.edu.javase.线程;

public class Dmeo {
    //线程2进入blocked状态。
    public static void main(String[] args) {
        test4();
       // Thread.yield();//进入runnable状态
    }
    //测试blocked状态
    public static void test4() {
        class A {
            //线程1获得实例锁以后线程2无法获得实例锁，所以进入blocked状态
            synchronized void run(String name) {
                System.out.println(name);
                while (true) {
                   // System.out.println("run");
                    try {
                        Thread.sleep(10000);
                        break;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        A a = new A();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t1 get lock");
                a.run("t1");
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t2 get lock");
                a.run("t2");
            }
        }).start();
    }
}
