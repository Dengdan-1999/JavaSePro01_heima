package com.itheima.d2_thread_api;

public class ThreadApiDemo2 {
    public static void main(String[] args) throws Exception {
        //目标：理解线程休眠

        //注意：会让当前执行的线程进入休眠时间，3S后会醒来
        for(int i=0;i<9;i++){
            System.out.println("输出:"+i);
            if(i==6){
                Thread.sleep(3000);

            }
            System.out.println("主线程输出:"+i);
        }

    }
}
