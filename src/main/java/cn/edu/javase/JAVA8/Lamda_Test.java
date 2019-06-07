package cn.edu.javase.JAVA8;

import org.junit.Test;

public class Lamda_Test {

	@Test
	public void test1(){
		op(100L, 200L, (x,y)->x*y);
	}
	
	public <R, T> void op(T l1, T l2, MyFunction<R, T> mf) {
		System.out.println(mf.getValue(l1, l2));
	}
	
}
