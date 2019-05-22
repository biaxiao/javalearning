package 设计模式.结构型模式.适配器模式.对象适配器模式;
/**
 * 怎么将鸡适配成鸭，这样鸡也能当鸭来用。因为，现在鸭这个接口，我们没有合适的实现类可以用，所以需要适配器。
 * 2019年5月22日
 *
 */
//毫无疑问，首先这个适配器肯定需要实现Duck，这样才能当做鸭来用
public class CockAdapter implements Duck{

	Cock cock;
	//构造方法中需要有鸡的实例，此类就是将这只鸡适配成鸭来用
	public CockAdapter(Cock cock) {
		this.cock=cock;
	}
	
	//实现鸭的呱呱叫方法
	@Override
	public void quack() {
		//内部其实是一只鸡的咕咕叫
		cock.gobble();
	}

	@Override
	public void fly() {
		cock.fly();
	}

}
