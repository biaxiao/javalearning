package cn.edu.javase.interclass;

import java.io.IOException;
import java.sql.SQLException;

class WithInner {
    class Inner {
        Inner(){
            System.out.println("this is a constructor in WithInner.Inner");
        };
    }
    WithInner(){
        System.out.println("-------------");
    }
}

public class InheritInner extends WithInner.Inner {
    // ! InheritInner() {} // Won't compile
    InheritInner(WithInner wi) {
        wi.super();
        System.out.println("this is a constructor in InheritInner");
    }
    /*InheritInner(){
        System.out.println("++++++++");
    }*/

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
        try {
int j=0;throw new SQLException();
        }catch (SQLException |  ArrayIndexOutOfBoundsException exception){

        }
    }
}
