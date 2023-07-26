package d4_BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo1 {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        BigDecimal a1= BigDecimal.valueOf(a);
        BigDecimal b1=BigDecimal.valueOf(b);

        System.out.println("a1="+a1);
        System.out.println("b1="+b1);

//        BigDecimal c1=a1.add(b1);
//        BigDecimal c1=a1.subtract(b1);
//        BigDecimal c1=a1.multiply(b1);
        BigDecimal c1=b1.divide(a1);
//        BigDecimal c1=a1.divide(b1); 这里会报错，因为无法精确表示
//        BigDecimal c1=a1.add(b1);
        System.out.println("c1="+c1);

        BigDecimal i=BigDecimal.valueOf(0.1);
        BigDecimal j=BigDecimal.valueOf(0.3);
        BigDecimal k=i.divide(j, RoundingMode.HALF_UP);
        System.out.println(k);


    }
}
