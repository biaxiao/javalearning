package 设计模式.行为型模式.观察者模式;
/**
 * 定义观察者接口
 * 2019年5月26日
 *
 */
public abstract class Observer {
	protected Subject subject;
	public abstract void update();
}

/*其实如果只有一个观察者类的话，接口都不用定义了，不过，通常场景下，既然用到了观察者模式，我们就是希望一个事件出来了，
会有多个不同的类需要处理相应的信息。比如，订单修改成功事件，我们希望发短信的类得到通知、发邮件的类得到通知、处理物流信息的类得到通知等。*/

//具体的几个观察者类
class BinaryObserver extends Observer{

	public BinaryObserver(Subject subject) {
		this.subject=subject;
		//通常在构造方法中将this发布出去的操作一定要小心
		this.subject.attach(this);
	}
	
	//该方法由主题类在数据变更时进行调用
	@Override
	public void update() {
		String result = Integer.toBinaryString(subject.getState());
		System.out.println("订阅的数据发生变化，新的数据处理为二进制值为：" + result);
	}
}

class HexaObserver extends Observer{

	 public HexaObserver(Subject subject) {
		 this.subject=subject;
		 this.subject.attach(this);
	}
	@Override
	public void update() {
		String result = Integer.toHexString(subject.getState()).toUpperCase();
		System.out.println("订阅的数据发生变化，新的数据处理为十六进制值为：" + result);
	}
	
}