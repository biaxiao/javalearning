package cn.edu.javase.JAVA8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.junit.Test;
interface AA{
	void CC ();
}
public class exer {

	@Test
	public void test6() {
//		DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE;
		  
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss E");
		
		LocalDateTime ldt = LocalDateTime.now();
		String strDate = ldt.format(dtf);
		
		System.out.println(strDate);
		
		LocalDateTime newLdt = LocalDateTime.parse(strDate, dtf);
		System.out.println(newLdt);
	}
	
	@Test
	public void test5() {
		Supplier<Employee> s = ()->{return new Employee();};
		Supplier<Employee> s2 = Employee::new;
		Consumer<Employee> c = (e)->new Employee(e);
		Consumer<Employee> c2= Employee::new;
		AA a=()->new Employee();
		AA aa=Employee::new;
	}
	
	
	@Test
	public void test1() {
		List<Employee> list = Arrays.asList(new Employee(0, "a", 21, 6666.66),new Employee(1, "b", 20, 5555.55),
				new Employee(3, "c", 27, 7777.77),new Employee(4, "d", 29, 9999.99));
		Collections.sort(list,(x,y)->Integer.compare(x.getAge(), y.getAge()));
		list.forEach(System.out::println);
	}
	
	@Test
	public void test2() {
		Function<String, String> fun = (x)->x.toUpperCase();
		System.out.println(fun.apply("abc"));
		Function<String, String> fun2 = String::toUpperCase;
		System.out.println(fun2.apply("cba"));
		Function<String,String> fun3 = x->x.substring(2, 5);
		System.out.println(fun3.apply("abcdefg"));
	}
	
	@Test
	public void test3() {
		Function<Long,Long> fun= x-> (long)Math.pow(x, 2);
		System.out.println(fun.apply(100L));
	}
	
	@Test
	public void test4() {
		List<Employee> emps = Arrays.asList(
				new Employee(102, "李四", 59, 6666.66),
				new Employee(101, "张三", 18, 9999.99),
				new Employee(103, "王五", 28, 3333.33),
				new Employee(104, "赵六", 8, 7777.77),
				new Employee(104, "赵六", 8, 7777.77),
				new Employee(104, "赵六", 8, 7777.77),
				new Employee(105, "田七", 38, 5555.55)
		);
		emps.stream()
		
			.filter((e) -> {
				System.out.println(e.getName());
				return e.getAge()>7;})
//			.limit(2)
			.distinct()
			.forEach(System.out::println);
	}
}
