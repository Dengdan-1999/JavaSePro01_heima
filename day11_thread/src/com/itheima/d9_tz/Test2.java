package com.itheima.d9_tz;

public class Test2 {
    public static void main(String[] args) {
        //目标：拓展悲观锁，乐观锁原理
        //乐观锁：一开始不上锁，大家一起跑，等到跑到临界资源的时候才锁住要访问的资源？
        //

        Runnable target=new MyRunnable();
        for(int i=0;i<=100;i++){
            new Thread(target).start();
        }
    }
}
