package cn.edu.javase;
class shapes{

}
public class lei {

    public static void main(String[] args) {
        try {
            Class obj=  Class.forName("cn.edu.javase.shapes");
            Object o = obj.newInstance();
            Class<shapes> obj2=shapes.class;
            shapes newShape = obj2.newInstance();
            Class<?> classInt = Integer.TYPE;
            Class<Integer> i=int.class;
            StringBuilder str = new StringBuilder("123");
            Class<?> klass = str.getClass();
            System.out.println(klass.isInstance(str));


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
