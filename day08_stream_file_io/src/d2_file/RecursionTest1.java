package d2_file;

public class RecursionTest1 {
    public static void main(String[] args) {
        //目标：认识递归
        test1();
    }

    public static void test1(){
        System.out.println("==test1==");
        test1();
    }
}
