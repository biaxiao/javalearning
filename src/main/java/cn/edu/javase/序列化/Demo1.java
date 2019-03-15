package cn.edu.javase.序列化;

import org.junit.Test;

import java.io.*;

public class Demo1 implements Serializable{
    @Test
    public void test2() throws IOException, ClassNotFoundException {
        B b = new B();
        b.i = 1;
        b.s = "a";
        //将obj写入文件
        FileOutputStream fileOutputStream = new FileOutputStream("temp");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(b);
        fileOutputStream.close();
        //通过文件读取obj
        FileInputStream fileInputStream = new FileInputStream("temp");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        B b2 = (B) objectInputStream.readObject();
        fileInputStream.close();
        System.out.println(b2.i);
        System.out.println(b2.s);
        //打印结果为0和null，即初始值，没有被赋值
        //0
        //null
    }

}
class B implements Externalizable {
    //必须要有公开无参构造函数。否则报错
    public B() {

    }
    int i;
    String s;
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
    }
}