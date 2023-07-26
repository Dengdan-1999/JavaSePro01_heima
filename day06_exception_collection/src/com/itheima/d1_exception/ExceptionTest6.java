package com.itheima.d1_exception;

import java.util.Scanner;

public class ExceptionTest6 {
    public static void main(String[] args) {
        //目标：掌握异常的处理方式二：有的时候会在外层捕获异常，然后尝试修复异常
        while(true){
            try{
                getPrice();
                break;
            }catch(Exception e){
                System.out.println("您录入的信息有毛病~~");
            }
        }
        System.out.println("继续。。。");
    }

    public static double getPrice(){
        System.out.println("请输入价格：");
        Scanner scanner=new Scanner(System.in);
        double price=scanner.nextDouble();
        return price;
    }
}
