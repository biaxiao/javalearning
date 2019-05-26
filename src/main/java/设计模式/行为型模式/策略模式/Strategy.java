package 设计模式.行为型模式.策略模式;
/**
 * 策略接口
 * 2019年5月26日
 *
 */
public interface Strategy {
	public void draw(int radius,int x, int y);
}

//定义几个具体的策略
class RenPen implements Strategy{

	@Override
	public void draw(int radius, int x, int y) {
		System.out.println("用红色笔画图，radius:"+radius+",x:"+x+",y:"+y);
	}
	
}

class GreenPen implements Strategy{

	@Override
	public void draw(int radius, int x, int y) {
		System.out.println("用绿色笔画图，radius:"+radius+",x:"+x+",y:"+y);
	}
	
}

class BluePen implements Strategy{

	@Override
	public void draw(int radius, int x, int y) {
		System.out.println("用蓝色笔画图，radius:"+radius+",x:"+x+",y:"+y);
	}
	
}