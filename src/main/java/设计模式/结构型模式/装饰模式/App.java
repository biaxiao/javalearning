package 设计模式.结构型模式.装饰模式;

public class App {
	public static void main(String[] args) {
		//首先，需要一个基础饮料，红茶、绿茶或咖啡
		Beverage beverage =new GreenTea();
		
		//开始装饰
		beverage =new Lemon(beverage);//先加一份柠檬
		beverage =new Mango(beverage);//再加一份芒果
		
		System.out.println(beverage.getDescription()+"价格：￥"+beverage.cost());
		
		//如果我们需要芒果珍珠双份柠檬红茶：
		//Beverage beverage = new Mongo(new Pearl(new Lemon(new Lemon(new BlackTea()))));
	}
}
