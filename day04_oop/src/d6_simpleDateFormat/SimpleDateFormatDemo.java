package d6_simpleDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        //目标：简单日期格式化类的使用
        //1.准备一个日期对象
        Date d=new Date();
        System.out.println(d);

        //2.创建简单日期格式化对象
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd HH:mm:ss EEE a");

        //3.开始格式化日期
        String rs=sdf.format(d);
        System.out.println(rs);

        //4.直接格式化时间毫秒值
        long time=System.currentTimeMillis();
        String rs2=sdf.format(time);
        System.out.println(rs2);

        Date d1=new Date();
        System.out.println(d1);

        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy:mm:dd HH:mm:ss");
        String d2=sdf1.format(d1);
        System.out.println(d2);
    }
}
