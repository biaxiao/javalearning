package cn.edu.javase.string;

import org.junit.Test;

public class Demo3 {
    @Test
    public void intern () {
        //2：string的intern使用
        //s1是基本类型，比较值。s2是string实例，比较实例地址
        //字符串类型用equals方法比较时只会比较值
        String s1 = "a";
        String s2 = new String("a");
        //调用intern时,如果s2中的字符不在常量池，则加入常量池(1.6是复制过去，1.7是把堆中引用放在常量池，不复制)并返回常量的引用
        String s3 = s2.intern();
        System.out.println(s1 == s2);//false
        System.out.println(s1 == s3);//true
    }

   /* string类 equals方法
   public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof String) {
            String anotherString = (String)anObject;
            int n = value.length;
            if (n == anotherString.value.length) {
                char v1[] = value;
                char v2[] = anotherString.value;
                int i = 0;
                while (n-- != 0) {
                    if (v1[i] != v2[i])
                        return false;
                    i++;
                }
                return true;
            }
        }
        return false;
    }
*/
   final class Fi {
       int a;
       final int b = 0;
       Integer s;

   }
    final char[]a = {'a'};
    final int[]b = {1};
    @Test
    public void final修饰类() {
        //引用没有被final修饰，所以是可变的。
        //final只修饰了Fi类型，即Fi实例化的对象在堆中内存地址是不可变的。
        //虽然内存地址不可变，但是可以对内部的数据做改变。
        Fi f = new Fi();
        f.a = 1;
        System.out.println(f);
        f.a = 2;
        System.out.println(f);
        //改变实例中的值并不改变内存地址。


        Fi ff = f;
        //让引用指向新的Fi对象，原来的f对象由新的引用ff持有。
        //引用的指向改变也不会改变原来对象的地址
        f = new Fi();
        System.out.println(f);
        System.out.println(ff);
    }



}
