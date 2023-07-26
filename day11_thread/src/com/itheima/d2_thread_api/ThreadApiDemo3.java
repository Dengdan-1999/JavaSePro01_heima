package com.itheima.d2_thread_api;

public class ThreadApiDemo3 {
    public static void main(String[] args) throws Exception {
        //目标：join线程
        Thread t1=new MyThread("子线程1");
        t1.start();
        System.out.println(t1.getName());

        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"执行输出："+i);
            if(i==2){
                //只要主线程执行到2，就让t1线程插队完全跑完，再执行主线程
                t1.join();
            }
        }

    }
}
