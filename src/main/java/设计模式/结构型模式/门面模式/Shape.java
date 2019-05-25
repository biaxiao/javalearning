package 设计模式.结构型模式.门面模式;

public interface Shape {
	void draw();
}
class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle::draw()");
	}
	
}

class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Rectangel::draw()");
	}
	
}