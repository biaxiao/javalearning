package 设计模式.创建型模式.建造者模式;
//核心是：先把所有的属性都设置给 Builder，然后 build() 方法的时候，将这些属性复制给实际产生的对象。
public class User {

	private String name;
	private int age;
	//构造函数私有化，不然可以直接new
	private User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static UserBuilder builder(){
		return new UserBuilder();
	}
	
	
	public static class UserBuilder{
		//和User一模一样的属性
		private String name;
		private int age;
		private UserBuilder(){
			
		}
		
		//链式调用设置各个属性值，返回this，即UserBuilder
		public UserBuilder name(String name) {
			this.name=name;
			return this;
		}
		
		public UserBuilder age(int age) {
			this.age=age;
			return this;
		}
		
		public User build() {
			if(name==null) {
				throw new RuntimeException("用户名必填");
			}
			if(age<=0||age>=150) {
				throw new RuntimeException("年龄不合法");
			}
			return new User(name, age);
		}
	}
	
	public static void main(String[] args) {
		User build = User.builder().name("a").age(22).build();
	}
}
