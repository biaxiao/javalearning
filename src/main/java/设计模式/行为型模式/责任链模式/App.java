package 设计模式.行为型模式.责任链模式;

public class App {
	public static void main(String[] args) {
		RuleHandler newUserHandler = new NewUserRuleHandler();
		RuleHandler locationHandler =new LocationRuleHandler();
		RuleHandler limitHandler = new LimitRuleHandler();
		
		Context context = new Context();
		
		//假设本次活动仅校验地区和奖品数量，不校验新老用户
		locationHandler.setSuccessor(limitHandler);
		locationHandler.apply(context);
		
	}
}
