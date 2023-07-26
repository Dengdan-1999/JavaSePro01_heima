package d1_inner_class;

public class Test {
    public static void main(String[] args) {
        //目标：掌握成员内部类的语法知识
        //创建成员内部类对象
        //外部类名.内部类名=new 外部类构造器.new 内部类构造器
        Outer.Inner in=new Outer().new Inner();
        System.out.println();
    }
}
