package com.itheima.d2_thread_api;
//目标：掌握多线程的常见方法

public class ThreadApiDemo1 {
    public static void main(String[] args) {

        //1.给线程设置名字
        Thread t=new MyThread("1号线程");
        t.start();



        //2.修改当前线程的名字
        Thread t2=new MyThread("2号线程");
        t2.start();
        System.out.println(t2.getName());


        //3.拿线程对象的名字
//        String name=t.getName();
//        System.out.println("子线程的名字是:"+name);

        //拿线程对象
        //注：哪个线程执行这个方法，这个方法就拿到哪个线程对象返回
        Thread t3=Thread.currentThread();
        t3.setName("去你妈的线程");
        System.out.println(t3.getName());

        for(int i=0;i<5;i++){
            System.out.println(t3.getName()+"执行输出："+i);
        }


    }
}
