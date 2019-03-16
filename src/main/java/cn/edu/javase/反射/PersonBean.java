package cn.edu.javase.反射;

public class PersonBean {
    private String name;
    public  double dm=1.0;
    int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void fuProtected(){}
    protected void fuProtected(int i){}
     void fuProtected(double i){}
    private void fuProtected(long i){}
}
