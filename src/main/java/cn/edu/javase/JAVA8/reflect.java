package cn.edu.javase.JAVA8;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Optional;

public class reflect {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		/*Method method = reflect.class.getMethod("main", String[].class);
		for (Parameter p : method.getParameters()) {
			System.out.println("__"+p.getName());
		}*/
//		使用of方法，仍然会报空指针异常
//      Optional optional = Optional.of(null);
//      System.out.println(optional.get());
      Optional optional = Optional.ofNullable(null);
//      
      System.out.println(optional.isPresent());
      System.out.println(optional.orElse(0));//当值为空时给与初始值
//      
      System.out.println(optional.orElseGet(() -> new String[]{"a"}));//使用回调函数设置默认值
//      System.out.println(optional.get());
      
      
	}
}
