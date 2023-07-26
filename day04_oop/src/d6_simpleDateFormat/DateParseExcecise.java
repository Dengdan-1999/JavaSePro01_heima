package d6_simpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParseExcecise {
    public static void main(String[] args) throws ParseException {
        //目标：练习字符串时间格式化类的使用：解析字符串时间成为日期对象
        //1.准备一个字符串时间
        String dateStr="2023-09-16 00:00:00";

        //2.准备一个简单格式化对象
        //注意：时间格式必须与被解析的时间格式一模一样
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //3.开始解析
        Date d=sdf.parse(dateStr);
        System.out.println(d);

    }
}
