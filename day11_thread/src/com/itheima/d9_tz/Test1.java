package com.itheima.d9_tz;

public class Test1 {
    public static void main(String[] args) {
        //目标：拓展悲观锁、乐观锁原理
        //悲观锁：一上来就加锁，没有安全感，每次只能一个线程进入
        //乐观锁：一开始不上锁，认为是没有问题的，大家一起跑，等到某个临界资源才
        //需求： 1变量，100个线程，每个线程对其加100次

        Runnable target=new MyRunnable();

        for(int i=1;i<=100;i++){
            new Thread(target).start();
        }

    }
}
