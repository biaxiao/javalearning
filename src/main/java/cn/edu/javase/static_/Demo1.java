package cn.edu.javase.static_;

public class Demo1 {

}
 class Fu {
    public static void show() {
        System.out.println("父类的静态方法");
    }
    public void method() {
        System.out.println("父类的一般方法");
    }
}
 class Zi extends Fu {
    public static void main(String[] args) {
      /*  Zi zi = new Zi();
        zi.show();
        zi.method();*/
      Fu f= new Zi();
      ((Zi) f).newShow();
    }
    public static void newShow() {
        System.out.println("子类的静态");
    }
    public void method() {
        System.out.println("子类的一般方法");
    }

}