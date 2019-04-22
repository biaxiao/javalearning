package cn.edu.javase.集合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class E {
	public static void main(String[] args) {
		int[] ints = {1,2,3,4,5};
        List list = Arrays.asList(ints);
        System.out.println("list'size：" + list.size());
        System.out.println("list 的类型:" + list.get(0).getClass());
        System.out.println("list.get(0) == ints：" + list.get(0).equals(ints));
		Integer a=1;
		int b=1;
		System.out.println(a==b);
//		Integer[] ints = {1,2,3,4,5};
//        List list = Arrays.asList(ints);
//        list.add(6);
//        System.out.println("list'size：" + list.size());
//        System.out.println("list.get(0) 的类型:" + list.get(0).getClass());
//        System.out.println("list.get(0) == ints[0]：" + list.get(0).equals(ints[0]));
		
//		List list1 = new ArrayList();
//		list1.add(1);
//		list1.add(2);
//		//通过构造函数新建一个包含list1的列表 list2
//	    List<Integer> list2 = new ArrayList<Integer>(list1);
//	    
//	    //通过subList生成一个与list1一样的列表 list3
//	    List<Integer> list3 = list1.subList(0, list1.size()-1);
//	    
//	    //修改list3
//	    list3.add(3);
//	    
//	    System.out.println("list1 == list2：" + list1.equals(list2));
//	    System.out.println("list1 == list3：" + list1.equals(list3));
//	    System.out.println(list1);
//	    System.out.println(list3);
//		List<Student> list = new ArrayList<>();
//        list.add(new Student("1", "chenssy1", 24));
//        list.add(new Student("2", "chenssy1", 26));
//        
//        Collections.sort(list);   //排序
//        
//        Student student = new Student("2", "chenssy1", 26);
//        
//        //检索student在list中的位置
//        int index1 = list.indexOf(student);
//        int index2 = Collections.binarySearch(list, student);
//        
//        System.out.println("index1 = " + index1);
//        System.out.println("index2 = " + index2);
//		
//		System.out.println(3>>1);
		
	}
}
