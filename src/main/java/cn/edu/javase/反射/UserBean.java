package cn.edu.javase.反射;

public class UserBean extends PersonBean implements User{
    @Override
    public void login() {

    }
    class B {

    }

    public String userName;
    protected int i;
    static int j;
    private int l;
    private long userId;
    public UserBean(String userName, long userId) {
        this.userName = userName;
        this.userId = userId;
    }
    public String getName() {
        return userName;
    }
    public long getId() {
        return userId;
    }
    @Invoke
    public static void staticMethod(String devName,int a) {
        System.out.printf("Hi %s, I'm a static method", devName);
    }
    @Invoke
    public void publicMethod() {
        System.out.println("I'm a public method");
    }
    @Invoke
    private void privateMethod() {
        System.out.println("I'm a private method");
    }
}
