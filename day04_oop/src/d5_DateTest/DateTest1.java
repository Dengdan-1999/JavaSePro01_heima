package d5_DateTest;

import java.util.Date;

public class DateTest1 {
    public static void main(String[] args) {
        //目标：掌握Date日期类的使用
        //1.创建Date日期对象，代表的是系统此刻日期和时间
        Date d=new Date();
        System.out.println(d);

        //2.拿到时间毫秒值
        long time=d.getTime();
        System.out.println(time);

        long time2=System.currentTimeMillis();
        System.out.println(time2);
    }
}
