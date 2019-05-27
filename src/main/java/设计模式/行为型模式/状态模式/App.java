package 设计模式.行为型模式.状态模式;
/**
 * 如果我们不关心当前 context 处于什么状态，那么 Context 就可以不用维护 state 属性了，那样代码会简单很多。
 * 
 * 不过，商品库存这个例子毕竟只是个例，我们还有很多实例是需要知道当前 context 处于什么状态的。
 */
public class App {
	public static void main(String[] args) {
		//我们需要操作的是iPhone X
		Context context = new Context("iPhone X");
		
		//看看怎么进行补库存操作
		State revertState =new RevertState();
		revertState.doAction(context);
		//获取当前的状态
		context.getState().toString();
		
		//减库存操作
		State deductState = new DeductState();
		deductState.doAction(context);
		
		context.getState().toString();
	}
}
