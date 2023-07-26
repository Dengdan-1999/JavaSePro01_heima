package com.itheima.d3_final;

public class Test {
    /*
    常量：public static final修饰的成员变量：建议名称全部大写，多个单词下划线连接
    常用于记录系统的配置信息
     */
//    public static final String SCHOOL_NAME="黑马";

    public static final String SCHOOL_NAME="东北大学";

    public static void main(String[] args) {
        //目标：认识final的作用
        //3.final可以修饰变量总规则：有且仅能赋值一次

        final int a;
        a=12;
        final double r=3.14;
       // r=0.1; 第二次赋值，出错了

        //final 修饰引用类型的变量，变量存储的地址不能被改变，但是地址指向的对象的内容可以被改变
        final int[] arr={11,22,33};
        arr[1]=222;

        int[] arr2={11,22,33};
        // arr=arr2;错误






    }

}
