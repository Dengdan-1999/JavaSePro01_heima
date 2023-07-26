package d1_stringbuilder;

public class SystemTest {
    public static void main(String[] args) {
        System.out.println("开始。。。");
        long time=System.currentTimeMillis();
        System.out.println(time);

        for(int i=0;i<100;i++){
            System.out.println("执行一次");
        }

        long time2=System.currentTimeMillis();
        System.out.println("耗时："+(time2-time)/1000.0+"s");
    }
}
