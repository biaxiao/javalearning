package cn.edu.javase.clas_inter;
class  B{
    public static void main(String[] a) {
        System.out.println("-BBBBB-");
        new jaav().main(new String[]{"a","b"});
    }
}
/*
一个java文件中可以包含很多个类，每个类中有且仅有一个主函数，但是每个java文件中可以包含多个主函数，
在运行时，需要指定JVM入口是哪个。
例如一个类的主函数可以调用另一个类的主函数。不一定会使用public类的主函数。
 */
 public class jaav {
    public static void main(String[] a) {
        System.out.println("---");
    }
    public static void main(String a){
//main 可以重载
    }
}
