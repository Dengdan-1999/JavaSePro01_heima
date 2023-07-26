package d14_Integer;

public class MyInterger {
    public static void main(String[] args) {
        Integer it3=234;//自动装箱
        System.out.println(it3+1);

        int i=it3;//自动拆箱

        System.out.println("============");
        //新增了功能
        //1.把基本类型的数据转换成字符串使用
        int age=23;
        String ageStr=Integer.toString(age);
        System.out.println(ageStr+1);

        Integer age2=23;
        String age2Str=age2.toString();
        System.out.println(age2Str+1);

        int age3=23;
        String age3Str=age3+"";
        System.out.println(age3Str);
    }
}
