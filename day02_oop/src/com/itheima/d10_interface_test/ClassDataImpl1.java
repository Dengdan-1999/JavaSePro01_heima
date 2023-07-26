package com.itheima.d10_interface_test;

import java.util.ArrayList;

public class ClassDataImpl1 implements ClassDate{
    private ArrayList<Student> students;

    @Override
    public void printAllStudents(){
        System.out.println("===展示全部学生信息");
        for(int i=0;i<students.size();i++){
            Student s=students.get(i);
            System.out.println(s.getName()+" "+s.getGender()+" "+s.getScore());
        }
    }

    @Override
    public void printAverageScore(){

    }

    @Override
    public void setStudents(ArrayList<Student> students){
        this.students=students;
    }
}
