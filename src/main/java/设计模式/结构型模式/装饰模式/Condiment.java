package 设计模式.结构型模式.装饰模式;
/**
 * 定义调料，也就是装饰者的基类，此类必须继承自Beverage
 * 2019年5月25日
 *
 */
//调料
public abstract class Condiment extends Beverage{

}

//定义柠檬、芒果等具体的调料，它们属于装饰者，毫无疑问这些调料肯定得继承Condiment类
class Lemon extends Condiment{
	//需要传入具体的饮料，如：需要传入没有被装饰的红茶或绿茶
	//也可以传入已经装饰好的芒果绿茶，这样就可以做芒果柠檬绿茶
	private Beverage beverage;
	
	public Lemon(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		//装饰
		return beverage.getDescription()+",加柠檬";
	}

	@Override
	public double cost() {
		//装饰
		return beverage.cost()+2;  //加柠檬需要2元
	}
}

class Mango extends Condiment{

	private Beverage beverage;
	
	
	public Mango(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+",加芒果";
	}

	@Override
	public double cost() {
		return beverage.cost()+3; //加芒果3元
	}
}

//给每一种调料都加一个类
