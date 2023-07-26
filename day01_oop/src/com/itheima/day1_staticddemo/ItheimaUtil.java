package com.itheima.day1_staticddemo;

import java.util.Random;

//
public class ItheimaUtil {
    // 工具类没有必要创建对象，所以构造方法私有
    private ItheimaUtil(){

    }

    public static String createVerifyCode(int n){
        String code="";
        String chars="abcdefghijklmnopqrstuvwxyz";
        Random r=new Random();
        for(int i=0;i<n;i++){
            int index=r.nextInt(chars.length());
            code+=chars.charAt(index);
        }
        return code;
    }

}
