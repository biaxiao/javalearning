package cn.edu.javase.clas_inter;

public class 代码块 {
    int i = 1;
    int initValue;//成员变量的初始化交给代码块来完成
    {
        //代码块的作用体现于此：在调用构造方法之前，用某段代码对成员变量进行初始化。
        //而不是在构造方法调用时再进行。一般用于将构造方法的相同部分提取出来。
        //
        for (int i = 0;i < 100;i ++) {
            initValue += i;
        }
    }
    {
        System.out.println(initValue);
        System.out.println(i);//此时会打印1
        int i = 2;//代码块里的变量和成员变量不冲突，但会优先使用代码块的变量
        System.out.println(i);//此时打印2
        j=10;
       // System.out.println(j);//提示非法向后引用，因为此时j的的初始化还没开始。可以赋值
        //
    }
    {
        System.out.println("代码块运行");
    }
    代码块(){
       // i=10;
        i=9;
        System.out.println(j+"构造方法运行-------"+i);
    }
    int j=2 ;
    {
        System.out.println(j);
        System.out.println(i);//代码块中的变量运行后自动释放，不会影响代码块之外的代码
    }


    public static void main(String[] args) {
        代码块 a=new 代码块();
    }
}
