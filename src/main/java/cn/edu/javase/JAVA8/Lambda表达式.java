package cn.edu.javase.JAVA8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import org.junit.Test;

public class Lambda表达式 {
	@Test
    public void test1() {
        List names = Arrays.asList("peter", "anna", "mike", "xenia");
        	int i=0;
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });
        System.out.println(Arrays.toString(names.toArray()));
    }
	
	@Test
    public void test2() {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        Collections.sort(names, (String a, String b) -> {
            return b.compareTo(a);
        });

        Collections.sort(names, (String a, String b) -> b.compareTo(a));

        Collections.sort(names, (a, b) -> b.compareTo(a));
        System.out.println(Arrays.toString(names.toArray()));
    }
	
	
	 static void add(double a,String b) {
	        System.out.println(a + b);
	    }
	    @Test
	    public void test5() {
	        D d = (a,b) -> add(a,b);
	        System.out.println(d);
//	        interface D {
//	            void get(int i,String j);
//	        }
	        //这里要求，add的两个参数和get的两个参数吻合并且返回类型也要相等，否则报错
//	        static void add(double a,String b) {
//	            System.out.println(a + b);
//	        }
	    }

	    @FunctionalInterface
	    interface D {
	        void get(int i,String j);
	    }
	    @FunctionalInterface
	    interface A {
	        void say();
	          default void talk() {
//	        	 System.out.println("hah");
	        }
	    }
	    @Test
	    public void test11() {
//	        A a = () -> System.out.println("hello");
//	        a.say();
//	        a.talk();
	    }
	    
	    
	    @FunctionalInterface
	    interface B {
	        void say(String i);
	    }
	    @Test
	    public void test21() {
	        //下面两个是等价的，都是通过B接口来引用一个方法，而方法可以直接使用::来作为方法引用
	        B b = System.out::println;
	        B b1 = (String g )-> Integer.parseInt(g);//这里的a其实换成别的也行，只是将方法传给接口作为其方法实现
	        B b1_ =  g -> Integer.parseInt(g);//这里的a其实换成别的也行，只是将方法传给接口作为其方法实现
	        B b2 = Integer::valueOf;//i与方法传入参数的变量类型一直时，可以直接替换
	        B b3 = String::valueOf;
	        B b4 = Integer::parseInt;//类型不符，无法使用

	        b.say("d");
	        b1.say("1");
	    }
	    
	    
	    @FunctionalInterface
	    interface C {
	        int say(String i);
	    }
	    public void test3() {
	        C c = Integer::parseInt;//方法参数和接口方法的参数一样，可以替换。
	        int i = c.say("1");
	        //当我把C接口的int替换为void时就会报错，因为返回类型不一致。
	        System.out.println(i);
	        //综上所述，lambda表达式提供了一种简便的表达方式，可以将一个方法传到接口中。
	        //函数式接口是只提供一个抽象方法的接口，其方法由lambda表达式注入，不需要写实现类，
	        //也不需要写匿名内部类，可以省去很多代码，比如实现runnable接口。
	        //函数式编程就是指把方法当做一个参数或引用来进行操作。除了普通方法以外，静态方法，构造方法也是可以这样操作的。
	    }
	    
	    
	    
	    
	    
	    
	    
    public static void main(String[] args) {

        Arrays.asList( "a", "b", "d" ).forEach((String e) -> System.out.println( e ) );
        int[] a=new int[]{1,2,3};
        Arrays.asList( "a", "b", "d" ).forEach( e -> {
            System.out.print( e );
            System.out.print( e );
        } );
        String separator = ",";
        Arrays.asList( "a", "b", "d" ).forEach(
                ( String e ) -> System.out.print( e + separator ) );
        final String separator1 = ",";
        Arrays.asList( "a", "b", "d" ).forEach(
                ( String e ) -> System.out.print( e + separator1 ) );
        /*System.out.println(Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> {
            int result = e1.compareTo( e2 );
            return result;
        } ));*/
        Function<String, Integer> stringToInteger = (String s) -> Integer.parseInt(s);
        
        
    }

}
