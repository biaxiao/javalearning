package 设计模式.创建型模式.单例模式.嵌套类;

/**
 *最经典，推荐 
 *
 */
public class Singleton {

	private Singleton() {
		
	}
	
	private static class Holder{
		private static Singleton s=new Singleton();
	}
	
	public static Singleton getInstance() {
		return Holder.s;
	}
}
