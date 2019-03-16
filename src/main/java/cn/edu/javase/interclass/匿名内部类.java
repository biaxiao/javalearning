package cn.edu.javase.interclass;

    public class 匿名内部类 {
        public InnerClass getInnerClass(final int age,final String name){
            return new InnerClass() {
                int age_ =age;
                String name_=name;
                //构造代码块完成初始化工作
               /* {
                    if(0 < age && age < 200){
                        age_ = age;
                        name_ = name;
                    }
                }*/
                public String getName() {
                    return name_;
                }

                public int getAge() {
                    return age_;
                }
            };
        }
}
class InnerClass{}