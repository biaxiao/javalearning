package cn.edu.javase.泛型;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public <T,K,L>  T p(T t){
        return t;
    }
    public static void main(String[] args) {
       /* Demo<String> d= new Demo<String>();
        d.p("1");

        if(d instanceof Demo){
            System.out.println("---");
        }*/
        //List<String>[] ls = new ArrayList<String>[10];
        // //在java中是”不能创建一个确切的泛型类型的数组”的
        List<?>[] ls = new ArrayList<?>[10];
        List<String>[] lqs = new ArrayList[10];
    }
    Generic<Integer> gInteger = new Generic<Integer>();
    Generic<Number> gNumber = new Generic<Number>();

}
 class Generic<T>{
}
interface Generator<T> {
    public T next();
}
class FruitGenerator implements Generator<Integer>{
    @Override
    public Integer next() {
        return null;
    }
}