package com.itheima.d6_objectSerialize;

import java.io.*;
import java.util.ArrayList;

//对象的序列化：指的是将Java对象存入到文件中去
//对象反序列化：指的是将文件中的Java对象读入到内存中来
public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws Exception {
        //目标：了解对象序列化，完成对象的序列化，把Java对象存储到文件中去
        //1.准备一个对象
        Student student=new Student("邓丹",9999999999l,35);
        Student student2=new Student("意义1",9999999999l,25);
        Student student3=new Student("意义2",9999999999l,25);
        Student student4=new Student("意义3",9999999999l,25);
        Student student5=new Student("意义4",9999999999l,25);
        Student student6=new Student("意义5",9999999999l,25);

        //2.创建一个对象字节输出流
        OutputStream os=new FileOutputStream("D:\\code\\huangpupro01\\haha.txt");
        ObjectOutputStream oop=new ObjectOutputStream(os);

        //3.把对象写出去保存
        oop.writeObject(student);

        //一次性序列化多个对象
        ArrayList<Student> students=new ArrayList<>();
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        oop.writeObject(students);


        //4.释放资源
        oop.close();

    }
}

class Student implements Serializable {
    public String name;
    //transient用于修饰不参与序列化的成员变量
    public transient long money;
    public int age;
    public Student(){

    }
    public Student(String name,long money,int age){
        this.name=name;
        this.money=money;
        this.age=age;
    }
}