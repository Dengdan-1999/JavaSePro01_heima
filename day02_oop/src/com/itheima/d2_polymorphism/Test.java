package com.itheima.d2_polymorphism;

public class Test {
    public static void main(String[] args) {
        //目标：理解多态的好处
        //好处1：可以实现解耦合，右边对象可以随时访问，后续任务随机改变
        // 多态对于方法：编译看左边，运行看右边
        //多态对于变量：编译看左边，运行看左边
        People p1=new Teacher();
        p1.run();
        System.out.println(p1.name);

        People p2=new Student();
        p2.run();
        System.out.println(p2.name);

        p1.go();
        p2.go();

    }

//    public static void go(People p){
//        if(p instanceof Student){
//            Student s=(Student)p;
//            s.go();
//        }
//        else if(p instanceof Teacher){
//            Teacher t=(Teacher)p;
//            t.go();
//        }
//        else{
//            System.out.println("出错了~");
//        }
//    }
}
