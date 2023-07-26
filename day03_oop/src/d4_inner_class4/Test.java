package d4_inner_class4;

public class Test {
    public static void main(String[] args) {
        //目标：理解匿名内部类的使用场景
        //1.创建
        Swimming s1=new Swimming(){
            @Override
            public void swim(){
                System.out.println("会不会游泳~~");
            }
        };
        go(s1);
    }

    //需求：猫狗都要来比赛
    public static void go(Swimming s){
        System.out.println("开始~~~~~~");
        s.swim();
        System.out.println("结束。。。。。。");
    }
}
