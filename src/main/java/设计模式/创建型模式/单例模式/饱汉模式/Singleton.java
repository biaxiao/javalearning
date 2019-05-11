package 设计模式.创建型模式.单例模式.饱汉模式;


/**
 *又叫 懒汉模式 
 *
 *	双重检查，指的是两次检查 s 是否为 null。

	volatile 在这里是需要的，希望能引起读者的关注。
 */
public class Singleton {
	private Singleton() {}
	
	private static volatile Singleton s=null;
	
	public static Singleton getInstance() {
		if(s==null) {
			synchronized(Singleton.class) {
				if(s==null) {
					s=new Singleton();
				}
			}
		}
		return s;
	}
	
}
