package com.itheima.d1_thread_create;

public class MyRunnable implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<9;i++){
            System.out.println("子线程在运行："+i);

        }
    }
}
