package cn.edu.javase.clas_inter;

public class A {
  //  int i=0;
    public void b(){
        int i=5;
        class B{
            public void a(){
                System.out.println(i);
            }

        }
        B b=new B();
        b.a();
    }

    public static void main(String[] args) {
        A a=new A();
        a.b();

    }
}
