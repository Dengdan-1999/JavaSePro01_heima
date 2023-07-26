package com.itheima.d1_thread_create;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;


/*
目标：掌握多线程的创建方式3：Callable FutureTask来实现
 */

public class ThreadDemo3 {
    public static void main(String[] args) throws Exception {
        //1.创建任务对象
        Callable<String> call=new MyCallable();
        //2.把Callable类型的对象封装成FutureTask(线程任务对象)
        FutureTask<String> ft=new FutureTask(call);
        //3.调用Thread对象的start方法启动线程
        Thread t=new Thread(ft);
        t.start();

        //4.线程执行完毕后，通过FutureTask对象的get方法去获取线程任务执行的结果
       try{
           String rs=ft.get();
           System.out.println(rs);
       }catch (Exception e){
           e.printStackTrace();
       }


    }
}
