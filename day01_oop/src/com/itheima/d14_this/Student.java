package com.itheima.d14_this;

public class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    private String name;
    private int age;
    private String schoolName;
    public Student(){

    }

    public Student(String name,int age){
        this(name,age,"黑马程序员");//调用兄弟构造器
    }
    public Student(String name,int age,String schoolName){
        this.name=name;
        this.age=age;
        this.schoolName=schoolName;
    }
}
