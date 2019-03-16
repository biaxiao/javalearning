package cn.edu.javase;

public class lei1 {


    public  lei1(){

    }
    public class shapes{}
    class round extends shapes{}
    public  void a() {
        Class<round> rclass=round.class;
        //Class<? super round> sclass= rclass.getSuperclass();
        Class<shapes> sclass= (Class<shapes>) rclass.getSuperclass();




    }


    public  void main(String[] args) {
        lei1 s=new lei1();
        //Object clone = s.clone();
    }
}


