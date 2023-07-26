package com.itheima.d1_array;


import java.util.Arrays;
import java.util.function.IntToDoubleFunction;

public class ArrayDemo1 {
    public static void main(String[] args) {
       int[] a={1,2,3,4,5,6};

       //1.返回数组的内容
        String b=Arrays.toString(a);
        System.out.println(b);

        //2.拷贝数组
        int[] c=Arrays.copyOfRange(a,2,4);
        System.out.println(Arrays.toString(c));

        //这两个输出有什么差别？
        char[] d={'a','b','c','d','e'};
        System.out.println(d);
        System.out.println(Arrays.toString(d));

        //3.给数组扩容
        String[] e={"dengdan","邓丹","一定","要好好努力","成为富婆"};
        System.out.println(e.length);
        System.out.println(Arrays.toString(e));
        String[] e2=Arrays.copyOf(e,9);
        System.out.println(e2.length);
        System.out.println(Arrays.toString(e2));

        //4.修改数组中每个数据，再存入
        double[] f={1.0,2.2,3.3,4.4,5.5,6.6};
        System.out.println(Arrays.toString(f));
        Arrays.setAll(f, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
               return f[value]+100;
            }
        });
        System.out.println(Arrays.toString(f));

        //5.给数组排序
        int[] g={12,11,2,24,44,36,78,99,0};
        Arrays.sort(g);
        System.out.println(Arrays.toString(g));



    }
}
