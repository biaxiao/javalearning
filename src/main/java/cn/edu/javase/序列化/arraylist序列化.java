package cn.edu.javase.序列化;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class arraylist序列化 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList list=new ArrayList();
        list.add("a");
        list.add("b");
        ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("arr"));
        oos.writeObject(list);
        oos.close();
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("arr"));
        ArrayList arrayList = (ArrayList)ois.readObject();
        ois.close();
        System.out.println(Arrays.toString(arrayList.toArray()));
    }
}
