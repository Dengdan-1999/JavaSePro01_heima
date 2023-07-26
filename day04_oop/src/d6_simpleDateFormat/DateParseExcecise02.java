package d6_simpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParseExcecise02 {
    public static void main(String[] args) throws ParseException {
        String dateStr1="2023年11月11日 00:01:18";
        String dateStr2="2023年11月11日 00:10:51";
        String beginStr="2023年11月11日 00:00:00";
        String endStr="2023年11月11日 00:10:00";

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d1=sdf.parse(dateStr1);
        Date d2=sdf.parse(dateStr2);
        Date d3=sdf.parse(beginStr);
        Date d4=sdf.parse(endStr);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);





    }
}
