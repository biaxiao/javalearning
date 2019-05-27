package 设计模式.行为型模式.状态模式;
/**
 * 商品库存中心有个最基本的需求是减库存和补库存，我们看看怎么用状态模式来写
 * 
 * 核心在于，我们的关注点不再是 Context 是该进行哪种操作，而是关注在这个 Context 会有哪些操作。
 * 
 * 2019年5月27日
 *
 */
//定义状态接口
public interface State {
	public void doAction(Context context);
}


//定义减库存的状态
class DeductState implements State{

	@Override
	public void doAction(Context context) {
		System.out.println("商品卖出，准备减库存");
		context.setState(this);
		
		//... 执行减库存的具体操作
	}
	
	public String toSting() {
		return "Deduct State";
	}
}

//定义补库存状态
class RevertState implements State{

	@Override
	public void doAction(Context context) {
		System.out.println("给此商品补库存");
		context.setState(this);
		
		//... 执行加库存的具体操作
	}
	
	public String toString() {
		return "Revert State";
	}
}