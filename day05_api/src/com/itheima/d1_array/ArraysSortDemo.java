package com.itheima.d1_array;
//目标：掌握Arrays类的排序
//对学生对象按照分数从高到低进行排序
//方法1


import java.util.Arrays;

public class ArraysSortDemo {
    public static void main(String[] args) {
        Student[] students=new Student[6];
        students[0]=new Student("殷素素",48,95);
        students[1]=new Student("张无忌",32,96);
        students[2]=new Student("赵敏",29,95);
        students[3]=new Student("周芷若",30,96);
        students[4]=new Student("小昭",28,92);
        students[5]=new Student("殷离",28,90);

        Arrays.sort(students);
        for(Student s:students){
            System.out.println(s);
        }

    }
}

class Student implements Comparable<Student>{
    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    private String name;
    private int age;
    private int score;

    @Override
    public int compareTo(Student o) {
        if(this.score>o.score){
            return 1;
        }
        else if(this.score<o.score){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString(){
        return this.name+", "+this.age+", "+this.score;
    }
}
