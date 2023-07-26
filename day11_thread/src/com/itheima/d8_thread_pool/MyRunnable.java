package com.itheima.d8_thread_pool;
/*
    1. 定义一个线程任务类实现Runnable接口

 */
public class MyRunnable implements Runnable{
    /*
      2.重写run方法
     */
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"输出："+i);
        }
    }

    public MyRunnable(){
//        System.out.println("当前线程的名字为"+Thread.currentThread().getName());
    }

    public MyRunnable(String name){
//        System.out.println("当前线程的名字为:"+Thread.currentThread().getName());
    }

}
