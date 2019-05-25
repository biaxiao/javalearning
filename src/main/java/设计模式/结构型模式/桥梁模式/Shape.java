package 设计模式.结构型模式.桥梁模式;

public abstract class Shape {
	protected DrawAPI drawAPI;
	
	protected Shape(DrawAPI drawAPI) {
		this.drawAPI=drawAPI;
	}
	public abstract void draw();
}

//圆形
class Circle extends Shape{
	private int radius;
	
	protected Circle(int radius, DrawAPI drawAPI) {
		super(drawAPI);
		this.radius=radius;
	}

	@Override
	public void draw() {
		drawAPI.draw(radius, 0, 0);
	}
}

//长方形
class Rectangle extends Shape{

	private int x;
	private int y;
	
	protected Rectangle(DrawAPI drawAPI,int x,int y) {
		super(drawAPI);
		this.x=x;
		this.y=y;
	}

	@Override
	public void draw() {
		drawAPI.draw(0, x, y);
	}
	
}