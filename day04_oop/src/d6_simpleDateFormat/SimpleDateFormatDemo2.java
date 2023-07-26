package d6_simpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo2 {
    public static void main(String[] args) throws ParseException {
        //目标：简单日期格式化类的使用：解析字符串时间成为日期对象
        //1.准备一个字符串时间
        String dateStr="2023-07-07 17:52:00";

        //2.创建和简单格式化对象
        //注意：时间格式必须与被解析的时间格式一模一样
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");

        //3.开始解析
        Date d=sdf.parse(dateStr);
        System.out.println(d);


    }
}
