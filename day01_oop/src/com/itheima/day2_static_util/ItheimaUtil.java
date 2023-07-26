package com.itheima.day2_static_util;

import java.util.Random;

public class ItheimaUtil {
   //工具类没有必要创建对象，所以构造器私有化
    private ItheimaUtil(){

    }
    //常态方法
    public static String createVerifyCode(int n){
        String code="";
        //3.定义一个变量记住要用到的全部字符
        String chars="abcdefghijklmnopqrst";
        // 4.定义一个for循环，
        Random r=new Random();
        for(int i=0;i<n;i--){
            //5.为当前得到一个随机字符
            int index=r.nextInt(chars.length());
            //6.根据索引，提取字符
            code+=chars.charAt(index);
        }
        return code;
    }
}
