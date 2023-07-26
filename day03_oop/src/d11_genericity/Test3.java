package d11_genericity;

import d6_enum.A;
//泛型擦除是什么东东，根本不懂
import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        //目标：理解泛型的注意事项
        //1.泛型只是工作在编译阶段，运行时被擦除
        ArrayList<String> list=new ArrayList<>();
        list.add("JAVA1");
        list.add("java2");

        //在编译阶段也是可以擦除
        ArrayList list2=list;
        list2.add(23.5);
        list2.add(true);
        System.out.println(list);
    }
}
