package 设计模式.结构型模式.桥梁模式;

public class App {
	public static void main(String[] args) {
		Shape greenCircle = new Circle(10, new GreenPen());
		Shape redRectangle= new Rectangle(new RedPen(), 4, 8);
		
		greenCircle.draw();
		redRectangle.draw();
		
	}
}
