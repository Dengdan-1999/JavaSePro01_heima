package d8_genericity;

import d6_enum.A;

public class Test {
    public static void main(String[] args) {
        //目标：认识泛型和其好处
        ArrayList1<String> list1=new ArrayList1<String>();
        ArrayList1<String> list2=new ArrayList1<>();

        list1.add("java");
        list1.add("前端");
        System.out.println(list1);

        String s=list1.get(1);
        System.out.println(s);

    }
}
