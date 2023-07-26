package d12_object;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        //目标：掌握Objects类的使用
        String name1=null;
        String name2="黑马abc";

        //使用Objects类提供的equals方法来比较对象，更加安全！
        System.out.println(Objects.equals(name1,name2));

        System.out.println(Objects.isNull(name1));
        System.out.println(name1==null);

        System.out.println(Objects.isNull(name2));
        System.out.println(name2==null);

        System.out.println(Objects.nonNull(name1));
        System.out.println(name1!=null);

        System.out.println(Objects.nonNull(name2));
        System.out.println(name1);
    }
}
