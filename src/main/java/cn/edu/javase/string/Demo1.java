package cn.edu.javase.string;

public class Demo1 {
//intern 1.6 1.7   https://blog.csdn.net/siqiangming/article/details/75037577
	//字符串字面量（"字符串"）一定先在字符串常量池中生成它（若没有）
    public static void main(String[] args) {
        String s = new String("1");
        System.out.println(s.intern());
        System.out.println(s==s.intern());
        String s2 = "1";
        System.out.println("ss:"+(s.intern() == s2));
        System.out.println(s == s2);

        String s3 = new String("1") + new String("1");
        s3.intern();
        String s4 = "11";
        System.out.println(s3 == s4);
    }
/*
*
 */

}
