package cn.edu.javase;

import java.util.ArrayList;
import java.util.List;

public class finly {
    public static void main(String[] args) {
        //System.out.println(bar());
        List<String> stringArrayList = new ArrayList<String>();
        List<Integer> integerArrayList = new ArrayList<Integer>();

        Class classStringArrayList = stringArrayList.getClass();
        Class classIntegerArrayList = integerArrayList.getClass();

        if(classStringArrayList.equals(classIntegerArrayList)){
            //Log.d("泛型测试","类型相同");
            System.out.println("yiyang");
        }



    }

    static class C <T> {
        T t;
    }



    private static int bar()
    {
        try {
            int a = 5;
            //return 7;
        } catch (Exception e){
            //return 1;
        } finally{
            System.out.println("finally");
          //  return 6;
        }
        System.out.println("-t-----");
return 7;
    }
}
