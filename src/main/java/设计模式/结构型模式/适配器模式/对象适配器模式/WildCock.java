package 设计模式.结构型模式.适配器模式.对象适配器模式;

public class WildCock implements Cock{

	@Override
	public void gobble() {
		System.out.println("咕咕叫");
	}

	@Override
	public void fly() {
		System.out.println("鸡会飞...");
	}

}
