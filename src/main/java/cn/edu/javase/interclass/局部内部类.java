package cn.edu.javase.interclass;

import org.junit.Test;

public class 局部内部类 {
    class A {//局部内部类就是写在方法里的类，只在方法执行时加载，一次性使用。
        public void test() {
            class B {
                static final int i=0;
                public void test () {
                    class C {

                    }
                }
            }
        }
    }
    @Test
    public void test () {
        int i = 1;
        final int j = 2;
        class A {
            @Test
            public void test () {
                System.out.println(i);
                System.out.println(j);
            }
        }
        A a = new A();
        System.out.println(a);
    }

    static class B {
        public static void test () {
            //static class A报错，方法里不能定义静态内部类。
            //因为只有在方法调用时才能进行类加载和初始化。
            /*static class A{}*/
            class A{}
        }
    }




        @Test
        public void test ( int k) {
            //利用接口写出一个实现该接口的类的实例。
            //有且仅有一个实例，这个类无法重用。
            new Runnable() {
                @Override
                public void run() {
                    //k = 1;//报错，当外部方法中的局部变量在内部类使用中必须改为final类型。
                    //因为方外部法中即使改变了这个变量也不会反映到内部类中。
                    //所以对于内部类来讲这只是一个常量。
                    System.out.println(100);
                    System.out.println(k);
                }
            };
            new D(){
                //实现接口的匿名类
                int i =1;
                @Override
                public void run() {
                    System.out.println("run");
                    System.out.println(i);
                    System.out.println(k);
                }
            }.run();
            new E(){
                //继承抽象类的匿名类
                int i = 1;
                void run (int j) {
                    j = 1;
                }

                @Override
                void work() {

                }
            };
        }


    public interface D{
        void run ();
    }
    abstract class E{
        E (){

        }
        abstract void work();
    }

}
