package com.itheima.d1_param;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //目标：掌握可变参数的使用。
        sum();  //不传参数
        sum(1); //可以传输一个参数
        sum(1,2,3,4,5,6);   //可以传输多个参数
        sum(new int[]{10,20,30,40,50,60});      //可以传输数组

    }

    //可变参数接收数据更加灵活
    //一个形参列表中可变参数只能有一个
    //可变参数必须放在形参列表的最后面
    public static void sum(int...nums){
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));
        System.out.println("------------------------------------");
    }
}
