package 设计模式.行为型模式.状态模式;

public class Context {
	private State state;
	private String name;
	public Context(String name) {
		this.name = name;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
}
