package 设计模式.创建型模式.工厂模式;

class AmericanFoodA extends	Food {}
class AmericanFoodB extends	Food {}	

public class AmericanFoodFactory implements FoodFactory{

	@Override
	public Food makeFood(String name) {
		if(name.equals("A")) {
			return new AmericanFoodA();
		}else if(name.equals("B")){
			return new AmericanFoodB();
		}else {
			return null;
		}
	}

}