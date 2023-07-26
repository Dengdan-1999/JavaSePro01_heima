package com.itheima.d5_regex;

public class RegexTest1 {
    public static void main(String[] args) {
        //目标：初步体验一下正则表达式的作用，校验数据
        System.out.println(checkQQ("19898852196"));
        System.out.println(checkQQ2("198%%$$"));
    }

    public static boolean checkQQ2(String qq){
        return qq!=null&&qq.matches("[1-9]\\d{5,}");
    }

    //先不用正则表达式来解决
    public static boolean checkQQ(String qq){
        //1.需求：要求这个QQ号码必须是5位以上，全都是数字，不能以0开头
        if(qq==null||qq.length()<=5||qq.startsWith("0")){
            return false;
        }

        //2.校验qq号码中是否全部都是数字
        for(int i=0;i<qq.length();i++){
            char ch=qq.charAt(i);
            if(ch<'0'||ch>'9'){
                return false;
            }
        }
        return true;
    }
}
