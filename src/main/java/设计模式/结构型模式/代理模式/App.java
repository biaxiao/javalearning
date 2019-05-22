package 设计模式.结构型模式.代理模式;
/**
 * 客户端调用
 * 2019年5月22日
 *
 */
public class App {
	public static void main(String[] args) {
		FoodService fs=new FoodServiceProxy();
		fs.makeChicken();
	}
}
