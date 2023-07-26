package com.itheima.d2_lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntToDoubleFunction;

public class LambdaTest2 {
    public static void main(String[] args) {
        //目标：掌握Lambda表达式简化常见函数式接口的匿名内部类
        double[] scores={50,100,90,95,60};
        //给每个成绩加10分
        Arrays.setAll(scores, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                return scores[value]+10;
            }
        });

        //简化1.0版本
        Arrays.setAll(scores,(int value)->{
            return scores[value]+10;
        });

        //简化2.0版本
        Arrays.setAll(scores,(value)->{
            return scores[value]+10;
        });

        //简化3.0版本 只有一个参数，类型和小括号都可以省略
        Arrays.setAll(scores,value->{
            return scores[value]+10;
        });

        Student[] students=new Student[6];
        students[0]=new Student("殷素素",48,95);
        students[1]=new Student("张无忌",32,96);
        students[2]=new Student("赵敏",29,95);
        students[3]=new Student("周芷若",30,96);
        students[4]=new Student("小昭",28,92);
        students[5]=new Student("殷离",28,90);
/*
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getAge()<o2.getAge()){
                    return 1;
                }
                else if(o1.getAge()>o2.getAge()){
                    return -1;
                }
               return 0;
            }
        });

        //简化1.0b版本
        Arrays.sort(students,(o1,o2)->{
            if(o1.getAge()<o2.getAge()){
                return 1;
            }
            else if(o1.getAge()>o2.getAge()){
                return -1;
            }
            return 0;
        });


 */

        //简化2.0版本
        Arrays.sort(students,(o1,o2)->{
            return Double.compare(o2.getAge(),o1.getAge());//按年龄降序排
        });
        //简化3.0版本
        Arrays.sort(students,(o1,o2)->Double.compare(o1.getAge(),o2.getAge()));

        for(Student s:students){
            System.out.println(s.toString());
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
