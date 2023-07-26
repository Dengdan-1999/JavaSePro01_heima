package d1_inner_class;

public class Outer {
    //成员内部类：属于外部类对象
    public class Inner{
        //类的所有东西都可以写
        private String name;
//        public static String schoolName;
        public void showName(){

        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name=name;
        }

    }

}
