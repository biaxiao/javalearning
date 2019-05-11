package 设计模式.创建型模式.工厂模式;

class ChineseFoodA extends	Food {}
class ChineseFoodB extends	Food {}	

public class ChineseFoodFactory implements FoodFactory{

	@Override
	public Food makeFood(String name) {
		if(name.equals("A")) {
			return new ChineseFoodA();
		}else if(name.equals("B")){
			return new ChineseFoodB();
		}else {
			return null;
		}
	}

}
