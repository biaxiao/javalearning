package 设计模式.结构型模式.代理模式;

public class FoodServiceImpl implements FoodService{

	@Override
	public Food makeChicken() {
		
		return new Chicken();
	}

	@Override
	public Food makeNoodele() {
		return new Noodle();
	}

}
