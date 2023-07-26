package com.itheima.d1_thread_create;
//多线程的创建方式1
public class MyThread extends Thread{
    //1.定义一个类继承线程类，重写run()方法
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("子线程在运行，输出："+i);
        }
    }
}
