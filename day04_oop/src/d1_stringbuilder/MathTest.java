package d1_stringbuilder;

public class MathTest {
    public static void main(String[] args) {
        //取绝对值
        System.out.println(Math.abs(-12));
        System.out.println(Math.abs(123));
        System.out.println(Math.abs(3.14));
        //向上取整
        System.out.println(Math.ceil(4.00));
        System.out.println(Math.ceil(4.0));
        //向下取整
        System.out.println(Math.floor(4.999999));
        System.out.println(Math.floor(4.00));

        //四舍五入
        System.out.println(Math.round(4.6));
        System.out.println(Math.round(4.499999));

        //最大值、最小值
        System.out.println(Math.max(10,20));
        System.out.println(Math.min(10,20));

        //取次方
        System.out.println(Math.pow(2,3));
        System.out.println(Math.pow(3,2));

        //取随机数
        System.out.println(Math.random());


    }
}
