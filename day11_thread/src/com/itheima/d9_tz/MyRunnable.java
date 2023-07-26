package com.itheima.d9_tz;

public class MyRunnable implements Runnable{
    private int count;

    @Override
    public void run(){
        //100次
        for(int i=0;i<100;i++){
            synchronized (this){
                ++count;
                System.out.println(Thread.currentThread().getName()+"count="+count);
            }
        }
    }
}
