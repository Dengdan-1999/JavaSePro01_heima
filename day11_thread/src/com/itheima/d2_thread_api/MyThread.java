package com.itheima.d2_thread_api;

public class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }

    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("子线程在执行：输出："+i);
        }
    }

}
