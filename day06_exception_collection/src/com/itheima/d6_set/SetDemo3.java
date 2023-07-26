package com.itheima.d6_set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo3 {
    public static void main(String[] args) {
        //需求：如果两个内容一样的不同对象就是重复的
        //
        Set<Student> sets=new HashSet<>();
        Student s1=new Student("王智",1,92);
        Student s2=new Student("张馨予",2,95);
        Student s3=new Student("张雨绮",3,93);
        Student s4=new Student("柳岩",4,90);
        Student s5=new Student("王智",1,92);
        Student s6=new Student("李依晓",5,94);
        System.out.println(s5.hashCode());
        System.out.println(s1.hashCode());

        sets.add(s1);
        sets.add(s2);
        sets.add(s3);
        sets.add(s4);
        sets.add(s5);
        sets.add(s6);
        System.out.println(sets);

    }
}
