package 设计模式.结构型模式.装饰模式;
/**
 * 基础饮料类  红茶、绿茶和咖啡
 * 2019年5月25日
 *
 */
class BlackTea extends Beverage{

	@Override
	public String getDescription() {
		return "红茶";
	}

	@Override
	public double cost() {
		return 10;
	}

}

class GreenTea extends Beverage{

	@Override
	public String getDescription() {
		return "绿茶";
	}

	@Override
	public double cost() {
		return 11;
	}
	
}

