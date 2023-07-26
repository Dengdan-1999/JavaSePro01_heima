package d2_inner_class2;

public class Outer {
    public static String name="外部类名";
    public int score=98;

    //静态内部类
    //可以访问外部类静态成员，不能直接访问外部类实例成员
    public static class Inner{
        public static void main(String[] args) {
            System.out.println(name);
        }
    }
}
