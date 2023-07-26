package com.itheima.d5_regex;

import java.util.Scanner;

public class RegexTest3 {
    public static void main(String[] args) {
        //目标：使用所学的正则表达式来校验数据的合法性
        //邮箱规则是自己写的
        checkEmail();
    }
    //3578584652@qq.com
    public static void checkEmail(){
        while(true){
            Scanner sc=new Scanner(System.in);
            System.out.println("请您输入邮箱：");
            String email=sc.next();
            if(email.matches("\\w{6,}@\\w{2,}(\\.\\w{2,})+")){
                System.out.println("邮箱合法，录入成功！");
                break;
            }else{
                System.out.println("您输入的邮箱有毛病，请重新输入！");
            }
        }
    }
}
