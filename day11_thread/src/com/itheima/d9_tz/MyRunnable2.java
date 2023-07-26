package com.itheima.d9_tz;

import java.util.concurrent.atomic.AtomicInteger;

public class MyRunnable2 implements Runnable{
//    private int count;

    //乐观锁
    private AtomicInteger count=new AtomicInteger();

    @Override
    public void run(){
        //100次
        for(int i=0;i<100;i++){
            synchronized (this){
                count.incrementAndGet();
                System.out.println(Thread.currentThread().getName()+"count="+count);
            }
        }
    }
}
