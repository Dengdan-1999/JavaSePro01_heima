package com.itheima.d3_method_reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntToDoubleFunction;

public class LambdaTest1 {
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

        //简化4.0版本
        //如果某个Lambda表达式里只是调用一个静态方法，并且前后参数的形式一致，就可以使用静态方法引用
        Arrays.sort(students,Student::compareByAge);

        System.out.println("----------------------------------------------");
        List<String> list=new ArrayList<>();
        list.add("java1");
        list.add("java2");
        list.add("java3");
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        list.forEach(s-> System.out.println(s));











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

    public static <Student> int compareByAge(Student o1, Student o2) {
       return 6;
        //这个方法在这里没有实际意义，只是为了演示静态方法

    }
}
