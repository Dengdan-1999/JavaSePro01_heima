package com.itheima.d1_array;
//方法2：利用public static<T> void sort(T[] arr,Comparator<?super T>c)
//对数组进行自定义排序
import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortDemo2 {
    public static void main(String[] args) {
        Student[] students=new Student[6];
        students[0]=new Student("殷素素",48,95);
        students[1]=new Student("张无忌",32,96);
        students[2]=new Student("赵敏",29,95);
        students[3]=new Student("周芷若",30,96);
        students[4]=new Student("小昭",28,92);
        students[5]=new Student("殷离",28,90);

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getAge()>o2.getAge()){
                    return 1;
                }
                else if(o1.getAge()<o2.getAge()){
                    return -1;
                }
                return 0;
            }
        });

        for(Student s:students){
            System.out.println(s.toString());
        }

    }

}


