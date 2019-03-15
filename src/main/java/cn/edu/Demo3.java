package cn.edu;

class FU{
    private  int i=1;
    int j=2;

    public void setI(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }
}
public class Demo3 extends FU {
    public static void main(String[] args) {
        Demo3 d =new Demo3();
        //System.out.println(super.j);
        d.setI(1);
        System.out.println(d.getI());
    }
}
