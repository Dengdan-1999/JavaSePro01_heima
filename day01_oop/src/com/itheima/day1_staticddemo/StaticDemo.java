package com.itheima.day1_staticddemo;

public class StaticDemo {
    public static void main(String[] args) {
        System.out.println(Student.count);
        Student s1=new Student("张馨予",36);
        Student s2=new Student("李依晓",36);
        System.out.println(Student.count);


    }
}
class Student{
    static int count=0;
    String name;
    int age;

    public Student(String name,int age){
        this.count=this.count+1;
        this.name=name;
        this.age=age;
    }

}