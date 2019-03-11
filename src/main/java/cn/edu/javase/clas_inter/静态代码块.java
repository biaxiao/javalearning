package cn.edu.javase.clas_inter;

import org.junit.Test;

  /*public*/ class 态代码块 {
    态代码块(){
        System.out.println("构造方法调用");
    }
    {
        System.out.println("代码块调用");
    }
    static {
        System.out.println("静态代码块调用");
    }

    public static void main(String[] args) {
        态代码块 c1 = new 态代码块();
        //静态代码块 c2 = new 静态代码块();
        //静态代码块 —–> 构造代码块 ——-> 构造方法
    }
    /*@Test
    public void test() {
        静态代码块 c1 = new 静态代码块();
        静态代码块 c2 = new 静态代码块();
        //结果,静态代码块只会调用一次，类的所有对象共享该代码块
        //一般用于类的全局信息初始化
        //静态代码块调用
        //代码块调用
        //构造方法调用
        //代码块调用
        //构造方法调用
    }*/
    class A{}//一个文件中可以只有非public类，如果只有非public类，此类可以跟文件名不同。
}