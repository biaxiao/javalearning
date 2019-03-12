package cn.edu.javase.finall;

public class Demo1 {
    final int s;//只要能在构造函数中完成对常量的初始化就好（一般情况下final修饰的变量一定要被初始化）
    Demo1(int s ){
        this.s=s;
    }
    Demo1(){
        s=0;
    }

    public static void main(String[] args) {
    }
}
class Bi {
    final int a = 1;
       static protected int go() {
        //final修饰方法无法被继承
        return 1;
    }
}
class Ci extends Bi {
     int a = 1;
       static   protected   int go()  {
            //final修饰方法无法被继承
           return 1;
        }


}