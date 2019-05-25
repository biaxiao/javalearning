package 设计模式.结构型模式.桥梁模式;

/**
 * 理解桥梁模式，其实就是理解代码抽象和解耦。
 * 
 * 2019年5月25日
 *
 */

/**
 *桥梁，它是一个接口，定义提供的接口方法
 */
public interface DrawAPI {
	public void draw(int radius, int x, int y);
}

class RedPen implements DrawAPI{
	@Override
	public void draw(int radius, int x, int y) {
		System.out.println("用红色笔画图，radius:"+radius+",x:"+x+",y:"+y);
	}
}

class GreenPen implements DrawAPI{
	@Override
	public void draw(int radius, int x, int y) {
		System.out.println("用绿色笔画图，radius:"+radius+",x:"+x+",y:"+y);
	}
}

class BluePen implements DrawAPI{
	@Override
	public void draw(int radius, int x, int y) {
		System.out.println("用蓝色笔画图，radius:"+radius+",x:"+x+",y:"+y);
	}
}







