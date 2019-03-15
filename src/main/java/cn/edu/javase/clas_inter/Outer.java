package cn.edu.javase.clas_inter;
abstract class Animal{

    public abstract Animal run();

    public abstract void sleep();
}


class Outer{

    public void print(){
        //需求： 在方法内部定义一个类继承Animal类，然后调用run方法与sleep()。
int i=9;
//i=0;
		//局部内部类
        //i=1;
		class Dog extends Animal{

			public Animal run(){
				System.out.println("狗在跑.."+i);
				return this;
			}

			public void sleep(){
				System.out.println("狗趴在睁开眼睛睡.."+i);
			}
		}

		//创建对象
		Dog d = new Dog();
		d.run();
		d.sleep();
        //匿名内部类 ：匿名内部类只是没有类名，其他的一概成员都是具备的。
        // 匿名内部类与Animal是继承 的关系。  目前是创建Animal子类的对象.
        Animal	a = new Animal(){  //多态

            //匿名内部的成员
            public Animal run(){
                System.out.println("狗在跑.."+i);
                return this;
            }

            public void sleep(){
                System.out.println("狗趴在睁开眼睛睡.."+i);
            }

            //特有的方法
            public void bite(){
                System.out.println("狗在咬人..");
            }

        };

        //a.bite();
        a.run();
        a.sleep();

    }
}



class Demo6
{
    public static void main(String[] args)
    {
        //System.out.println("Hello World!");

        Outer outer = new Outer();
        outer.print();

    }
}