package 设计模式.结构型模式.门面模式;

public class App {
	public static void main(String[] args) {
		//非门面模式调用
		//画一个圆形
		Shape circle = new Circle();
		circle.draw();
		//画一个长方形
		Shape rectangele = new Rectangle();
		rectangele.draw();
		
		
		//门面模式调用，让客户端调用更加友好一些
		//客户端调用现在更加清晰
		ShapeMaker shapeMaker= new ShapeMaker();
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
	}
}
