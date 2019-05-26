package 设计模式.行为型模式.策略模式;
/**
 * 使用策略类
 * 2019年5月26日
 *
 */
public class Context {
	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void executeDraw(int radius, int x,int y) {
		strategy.draw(radius, x, y);
	}
	
}
