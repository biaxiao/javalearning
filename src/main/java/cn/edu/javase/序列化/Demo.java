package cn.edu.javase.序列化;

import org.junit.Test;

import java.io.*;

public class Demo  implements Serializable {
    class A implements Serializable {

        int i;
        String s;
    }
    @Test
    public void test() throws IOException {
        A a = new A();
        a.i = 1;
        a.s = "a";
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        try {
            //将obj写入文件
            fileOutputStream = new FileOutputStream("temp");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(a);
            fileOutputStream.close();
            //通过文件读取obj
            fileInputStream = new FileInputStream("temp");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            A a2 = (A) objectInputStream.readObject();
            fileInputStream.close();
            System.out.println(a2.i);
            System.out.println(a2.s);
            //打印结果和序列化之前相同
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

