package cn.edu.javase;


import org.junit.Test;

public class lei2 implements Cloneable {
    @Test
    public void test1() throws CloneNotSupportedException {

        lei2 user = new lei2();
        lei2 copy = (lei2) user.clone();
        System.out.println(copy);
    }
    public void test2() {
        lei2 user = new lei2();
//        User copy = (User)user.clone();
    }
}
