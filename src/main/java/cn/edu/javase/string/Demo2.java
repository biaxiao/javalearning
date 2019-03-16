package cn.edu.javase.string;

import org.junit.Test;

/*

String
 */
public class Demo2 {
    @Test
    public void contact () {
        //1连接方式
        String s1 = "a";
        String s2 = "a";
        String s3 = "a" + s2;//会产生 StringBuilder
      //   s3.intern();// 加上 这个s3==s4 就为true
        String s4 = "a" + "a";
        String s5 = s1 + s2;
        //表达式只有常量时，编译期完成计算
        //表达式有变量时，运行期才计算，所以地址不一样
        System.out.println(s3 == s4); //f
        System.out.println(s3 == s5); //f
        System.out.println(s4 == "aa"); //t

    }
/*https://bbs.csdn.net/topics/220015609
为了加深理解，我们可以来做几个小实验。

javac Test         编译文件
javap -c Test   查看虚拟机指令

实验一：纯字符串
Java code
?
1
2
3
4
5
public class Test {
    public static void main(String args[]) {
        String str = "a";
    }
}


   // 将字符串 a 存入常数池
   0:   ldc     #2; //String a
   // 将引用存放到 1 号局部变量中
   2:   astore_1
   3:   return

实验二：纯字符串相加
Java code
?
1
2
3
4
5
public class Test {
    public static void main(String args[]) {
        String str = "a" + "b";
    }
}


   // 将字符串 ab 压入常数池
   0:   ldc     #2; //String ab
   2:   astore_1
   3:   return

实验二可以很明显地看出，编译器在编译时产生的字节码已经将 "a" + "b" 优化成了 "ab"，
同理多个字符串的相加也会被优化处理，需要注意的是字符串常量相加。

实验三：字符串与自动提升常量相加
Java code
?
1
2
3
4
5
public class Test {
    public static void main(String args[]) {
        String str = "a" + (1 + 2);
    }
}


   // 将字符串 a3 压入常数池
   0:   ldc     #2; //String a3
   2:   astore_1
   3:   return

通过虚拟机指令可以看出，1 + 2 自动提升后的常量与字符串常量，虚拟机也会对其进行优化。

实验二、实验三结论：常量间的相加并不会引起效率问题

实验四：字符串与变量相加
Java code
?
1
2
3
4
5
6
public class Test {
    public static void main(String args[]) {
        String s = "b";
        String str = "a" + s;
    }
}


   // 将字符串 b 压入常数池
   0:   ldc     #2; //String b
   // 将引用存放到 1 号局部变量中
   2:   astore_1
   // 检查到非常量的相加，这时创建 StringBuilder 对象
   3:   new     #3; //class java/lang/StringBuilder
   // 从栈中复制出数据，即把字符串 b 复制出来
   6:   dup
   // 调用 StringBuilder 的初始构造
   7:   invokespecial   #4; //Method java/lang/StringBuilder."<init>":()V
   // 将字符串 a 压入常数池
   10:  ldc     #5; //String a
   // 调用 StringBuilder 的 append 方法，把字符串 a 添加进去
   12:  invokevirtual   #6; //Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   // 从 1 号局部变量中加载数据引用
   15:  aload_1
   // 调用 StringBuilder 的 append 方法，把字符串 b 添加进去
   16:  invokevirtual   #6; //Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   // 调用 StringBuilder 的 toString 方法
   19:  invokevirtual   #7; //Method java/lang/StringBuilder.toString:()Ljava/lang/String;
   // 将 toString 的结果保存至 2 号局部变量
   22:  astore_2
   23:  return

实验四可以看出，非常量字会串相加时，由于相加的变量中存放的是字符串的地址引用，
因为在编译时无法确切地知道其他具体的值，也就没有办法对其进行优化处理，这时为了
达到连接的效果，其内部采用了 StringBuilder 的机制进行处理（JDK 5 中新增的，我
这里没有 JDK 1.4，估计在 JDK 1.4 下采用的是 StringBuffer），将他们都 append
进去，最后用 toString 输出。

若 s 为其他类型时，比如：int 类型，也是采用同种方式进行处理。

同理，根据实验二的结果，在 String str = "a" + "b" + s; 时，先会优化成 "ab" 再与
s 根据实验四的方式进行处理，这时 StringBuilder 仅调用了两次 append 方法。

如果是 String str = "a" + s + "b"; 这种形式的就没办法优化了，StringBuilder 得调
用三次 append 方法。

实验四的结论表明，字符串与变量相加时在内部产生了 StringBuilder 对象并采取了一定
的操作。

如果只有一句 String str = "a" + s; 这样子的，其效率与
String str = new StringBuilder().append("a").append(s).toString();
是一样的。

一般所说的 String 采用连接运算符（+）效率低下主要产生在以下的情况中：

Java code
?
1
2
3
4
5
6
7
8
public class Test {
    public static void main(String args[]) {
        String s = null;
        for(int i = 0; i < 100; i++) {
            s += "a";
        }
    }
}


每做一次 + 就产生个 StringBuilder 对象，然后 append 后就扔掉。下次循环再到达时重
新产生个 StringBuilder 对象，然后 append 字符串，如此循环直至结束。

如果我们直接采用 StringBuilder 对象进行 append 的话，我们可以节省 N - 1 次创建和
销毁对象的时间。
 */

}
