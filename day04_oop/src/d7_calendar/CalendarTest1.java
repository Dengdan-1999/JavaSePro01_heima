package d7_calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest1 {
    public static void main(String[] args) {
        //目标：掌握日历的使用
        //1.得到日历对象，代表系统此刻日历
        Calendar r= Calendar.getInstance();
        System.out.println(r);

        //
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


        //2.取日期信息
        //单独获取信息
        int year=r.get(Calendar.YEAR);
        System.out.println(year);

        int mm=r.get(Calendar.MONTH)+1;
        System.out.println(mm);

        int days=r.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

        //3.获取时间毫秒值
//        long time=r.getTimeInMillis();
//        System.out.println(time);

        Date d=r.getTime();
        System.out.println(d);

        //将获取到的时间更改为我们想要的格式
        String dataStr=sdf.format(d);
        System.out.println(dataStr);


        //4.修改时间
        r.set(Calendar.YEAR,2024);
        r.set(Calendar.MONTH,9);
        r.set(Calendar.HOUR,19);

        //5.给某个字段增加值，3666天后的时间
        r.add(Calendar.DAY_OF_YEAR,3666);

        //Calendar称为可变日期对象，一旦前面修改了，这个日历的信息就随之改变
        Date d2=r.getTime();
        System.out.println(d2);
        System.out.println(sdf.format(d2));
    }
}
