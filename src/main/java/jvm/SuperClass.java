package jvm;

public class SuperClass {
	static {
		System.out.println("SuperClass 初始化");
	}
	public static int value=123;
}

class SubClass extends SuperClass{
	static {
		System.out.println("SubClass bbbb初始化");
	}
}