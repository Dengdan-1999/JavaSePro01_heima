package com.itheima.d1_thread_create;

public class ThreadDemo1 {
    public static void main(String[] args) {
        //创建MyThread类的对象
        Thread t=new MyThread();
        //调用线程对象的start()方法启动线程
        t.start();
        //

        for(int i=0;i<9;i++){
            System.out.println("主线程在执行，输出："+i);
        }
    }
}
