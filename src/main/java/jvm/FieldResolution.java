package jvm;

public class FieldResolution {
	interface in0{
		int A=0;
	}
	
	interface in1 extends in0{
		int A=1;
	}
	
	interface in2{
		int A=2;
	}
	
	static class P implements in1{
		public static int A=3;
	}
	
	static class Sub extends P implements in2{
		//public static int A =4;
	}
	
	public static void main(String[] args) {
//		System.out.println(Sub.A);
	}
	
}
