package 设计模式.结构型模式.门面模式;
/*
 * 定义一个门面
 * 
 * 门面模式：把需要的对象封装在门面类中，这样直接调用方法，不需要每次new出相应的对象来调用需要的方法
 * 客户端不再需要关注实例化时应该使用哪个实现类，直接调用门面提供的方法就可以了，因为门面类提供的方法的方法名对于客户端来说已经很友好了。
 */
public class ShapeMaker {
	private Shape circle;
	private Shape rectangle;
//	private Shape square;
	public ShapeMaker() {
		circle=new Circle();
		rectangle=new Rectangle();
	}
	
	/**
	 * 下面到定义一堆方法，具体应该调用什么方法，由这个门面来决定
	 */
	public void drawCircle() {
		circle.draw();
	}
	
	public void drawRectangle() {
		rectangle.draw();
	}
	
}
