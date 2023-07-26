package com.itheima.d5_regex;

import java.util.Arrays;

public class RegexTest7 {
    public static void main(String[] args) {
        //
        //需求：请把 迪丽热巴111111刘亦菲222222赵丽颖333333杨幂444444刘诗诗555555中间的非文字部分去掉
        String data="迪丽热巴111111刘亦菲222222赵丽颖333333杨幂444444刘诗诗555555";
        //参数一：正则表达式，匹配内容的；参数二：替换的内容
        String rs=data.replaceAll("\\w+","/");
        System.out.println(rs);
        String[] rs2=rs.split("\\/");
        System.out.println(Arrays.toString(rs2));

        //需求2(拓展，了解，可以不用记)
        String s2="王王王一一一博博博博博博";
        /*
        (.)一组：匹配任意字符
        \\1:为这个组声明一个组号1
        +：声明必须是重复的字
        $1可以去取得第1组代表的那个重复的字
         */
        System.out.println(s2.replaceAll("(.)\\1+","$1"));

        System.out.println(s2);

    }
}
