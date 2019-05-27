package 设计模式.行为型模式.模板模式;

public abstract class AbstractTemplate {
	//这就是模板方法
	public void templateMethod() {
		init();
		apply(); //这个是重点
		end();  //可以作为钩子方法
	}
	
	protected void init() {
		System.out.println("init 抽象层已经实现，子类也可以选择覆写");
	}
	
	//留给子类实现
	protected abstract void apply();
	
	protected void end() {
		
	}
}

/*模板方法中调用了 3 个方法，其中 apply() 是抽象方法，子类必须实现它，其实模板方法中有几个抽象方法完全是自由的，
我们也可以将三个方法都设置为抽象方法，让子类来实现。也就是说，模板方法只负责定义第一步应该要做什么，第二步应该做什么，
第三步应该做什么，至于怎么做，由子类来实现。*/

//实现类
class ConcreteTemplate extends AbstractTemplate{

	@Override
	protected void apply() {
		System.out.println("子类实现抽象方法 apply");
	}
	
	@Override
	protected void end() {
		System.out.println("我们可以把 method3当做钩子来使用，需要的时候覆写就可以了");
	}
	
}