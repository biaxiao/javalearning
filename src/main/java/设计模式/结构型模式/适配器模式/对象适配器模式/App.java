package 设计模式.结构型模式.适配器模式.对象适配器模式;
/**
 * 客户端调用
 * 2019年5月22日
 *
 */
public class App {
	public static void main(String[] args) {
		Cock wildCock=new WildCock();
		Duck duck= new CockAdapter(wildCock);
		duck.fly();
		duck.quack();
	}
}
