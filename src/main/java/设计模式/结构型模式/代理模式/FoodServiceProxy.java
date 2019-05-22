package 设计模式.结构型模式.代理模式;

//代理要表现的“就像是”真实实现类，所以需要实现FoodService
public class FoodServiceProxy implements FoodService{

	//内部一定要有一个真实的实现类，当然也可以通过构造方法注入
	private FoodService foodService= new FoodServiceImpl();
	
	@Override
	public Food makeChicken() {
		System.out.println("开始制作鸡肉...");
		
		//如果我们定义这句为核心代码的话，那么，核心代码是真实实现类做的，
		//代理只是在核心代码的前后做些“无足轻重”的事情
		Food food = foodService.makeChicken();
		
		System.out.println("鸡肉制作完成，加点孜然...");//增强
		
		return food;
	}

	@Override
	public Food makeNoodele() {
		System.out.println("制作拉面...");
		
		Food food = foodService.makeNoodele();
		
		System.out.println("制作完成了....");
		
		return food;
	}

}
