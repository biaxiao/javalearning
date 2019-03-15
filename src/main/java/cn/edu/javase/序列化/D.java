package cn.edu.javase.序列化;

import org.junit.Test;

import java.io.*;

 class C implements Externalizable {
   private int i;
    int j;
    String s;
    public C() {
        System.out.println("++++++");
    }
    public void  setI(int i){
        this.i=i;
    }

     public int getI() {
         return i;
     }

     //实现下面两个方法可以选择序列化中需要被复制的成员。
    //并且，写入顺序和读取顺序要一致，否则报错。
    //可以写入多个同类型变量，顺序保持一致即可。
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(i);
        //out.writeInt(j);
        out.writeObject(s);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        i = in.readInt();
        System.out.println(i);
        //j = in.readInt();
        s = (String) in.readObject();
    }


}
public class D{
    @Test
    public void test3() throws IOException, ClassNotFoundException {
        C c = new C();
        c.setI(1);
        c.j = 2;
        c.s = "a";
        //将obj写入文件
        FileOutputStream fileOutputStream = new FileOutputStream("temp");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(c);
        fileOutputStream.close();
        //通过文件读取obj
        FileInputStream fileInputStream = new FileInputStream("temp");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        C c2 = (C) objectInputStream.readObject();
        fileInputStream.close();
        System.out.println(c2.getI());
        System.out.println(c2.j);
        System.out.println(c2.s);
    }
}