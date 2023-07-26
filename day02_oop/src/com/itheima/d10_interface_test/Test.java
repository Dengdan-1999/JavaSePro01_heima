package com.itheima.d10_interface_test;


import java.util.ArrayList;
//这个demo写不出来

public class Test {
    public static void main(String[] args) {
        //1.面向接口编程，处理学生对象的
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student("张武君",92,'m'));
        students.add(new Student("张无忌",98,'m'));
        students.add(new Student("赵敏",99,'f'));
        students.add(new Student("周芷若",99,'f'));
        students.add(new Student("小昭",95,'f'));
        students.add(new Student("杨不悔",90,'f'));
        students.add(new Student("纪晓芙",93,'f'));
        students.add(new Student("殷素素",96,'f'));

//        ClassData imp1=new ClassDataImpl1(); 这里不知道为什么出错




    }
}
