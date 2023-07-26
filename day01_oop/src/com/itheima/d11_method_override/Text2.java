package com.itheima.d11_method_override;

public class Text2 {
    public static void main(String[] args) {
        //目标：掌握方法重写的应用场景
        People p = new People();
        p.setAge(36);
        p.setName("dengdan");
        p.setWealth(36000000000l);
        System.out.println(p.toString());

    }
}
