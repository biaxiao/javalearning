package cn.edu.javase.JAVA8;
@FunctionalInterface
public interface MyFunction<R,T> {
	public R getValue(T t1, T t2);
}
