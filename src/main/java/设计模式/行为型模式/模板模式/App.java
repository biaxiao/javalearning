package 设计模式.行为型模式.模板模式;

public class App {
	public static void main(String[] args) {
		AbstractTemplate t = new ConcreteTemplate();
		//调用模板方法
		t.templateMethod();
	}
}
