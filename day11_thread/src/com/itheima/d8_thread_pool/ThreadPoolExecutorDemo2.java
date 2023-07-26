package com.itheima.d8_thread_pool;

import java.util.concurrent.*;

public class ThreadPoolExecutorDemo2 {
    public static void main(String[] args) {
        //目标：创建线程池对象，处理Callable任务
        //1.创建线程池
        ExecutorService pool=new ThreadPoolExecutor(3,5,1, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(2),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        //2.提Callable任务给线程池执行
        Future<String> f1=pool.submit(new MyCallable(100));
        Future<String> f2=pool.submit(new MyCallable(6));
        Future<String> f3=pool.submit(new MyCallable(8));

        try{
            String s=f1.get();
        }catch(Exception e){
            e.printStackTrace();
        }

        try{
            String s2=f2.get();
        }catch(Exception e){
            e.printStackTrace();
        }

        try{
            String s3=f3.get();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
