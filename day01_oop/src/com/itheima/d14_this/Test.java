package com.itheima.d14_this;

public class Test {
    public static void main(String[] args) {
        //目标：了解this调用兄弟构造器
        Student s1=new Student("张无忌",26);
        System.out.println(s1.getAge());
        System.out.println(s1.getName());
        System.out.println(s1.getSchoolName());

        Student s2=new Student("赵敏",21,"北京大学");
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        System.out.println(s2.getSchoolName());
    }
}
