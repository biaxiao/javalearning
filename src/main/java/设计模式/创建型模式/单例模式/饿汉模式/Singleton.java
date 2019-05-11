package 设计模式.创建型模式.单例模式.饿汉模式;

import java.util.Date;

public class Singleton {
	
	private static Singleton s=new Singleton();
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return s;
	}
	
	
	
	
	
	// 瞎写一个静态方法。这里想说的是，如果我们只是要调用 Singleton.getDate(...)，
    // 本来是不想要生成 Singleton 实例的，不过没办法，已经生成了
    public static Date getDate(String mode) {return new Date();}
	//很多人都能说出饿汉模式的缺点，可是我觉得生产过程中，很少碰到这种情况：你定义了一个单例的类，不需要其实例，
    //可是你却把一个或几个你会用到的静态方法塞到这个类中。
}
