package 设计模式.创建型模式.简单工厂模式;
/**
 * 创建型模式  之  简单工厂模式
 * 
 * 创建型模式的作用就是创建对象，说到创建一个对象，最熟悉的就是 new 一个对象，然后 set 相关属性。
 * 但是，在很多场景下，我们需要给客户端提供更加友好的创建对象的方式，尤其是那种我们定义了类，但是需要提供给其他开发者用的时候。
 * 
 * 简单地说，简单工厂模式通常就是这样，一个工厂类 XxxFactory，里面有一个静态方法，根据我们不同的参数，返回不同的派生自同一个父类（或实现同一接口）的实例对象。
 */
class Food{}
class LanZhouNoodle extends Food{}
class HuangMenChicken extends Food{}
public class FoodFactory {
	public static Food makeFood(String name) {
		if(name.equals("noodle")) {
			Food noodle =new LanZhouNoodle();
			return noodle;
		}else if(name.equals("chicken")) {
			Food chicken= new HuangMenChicken();
			return chicken;
		}else {
			return null;
		}
	}
}
