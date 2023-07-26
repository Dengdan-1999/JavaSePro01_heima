package com.itheima.d1_exception;

import java.util.Scanner;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        //目标：学会自定义异常，并使用
        System.out.println("请输入你的年龄：");
        int age;
        Scanner scanner=new Scanner(System.in);
        age=scanner.nextInt();
        checkAge(age);

    }

    public static void checkAge(int age) throws AgeIllegalException{
        if(age<0||age>120){
            //出现异常，抛给上层调用者
            throw new AgeIllegalException("age is illegal");
        }else{
            System.out.println("你的年龄是："+age);
        }
    }
}

