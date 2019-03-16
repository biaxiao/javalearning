package cn.edu.javase;

import java.util.Scanner;

public class io流 {
    //测试System.in, System.out, System.err
    public static void main(String[] args) {
        int in = new Scanner(System.in).nextInt();
        System.out.println(in);
        System.out.println("out");
        System.err.println("err");
        //输入10，结果是
//        10
//        out
//        err（红色）
    }
}
