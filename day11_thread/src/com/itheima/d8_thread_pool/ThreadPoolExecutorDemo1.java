package com.itheima.d8_thread_pool;

import java.util.concurrent.*;

public class ThreadPoolExecutorDemo1 {
    public static void main(String[] args) {
        //目标：创建线程池对象，处理Runnable任务
        //1.创建线程池
        ExecutorService pool=new ThreadPoolExecutor(3, 5,
                6, TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(2),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        //2.提交Runnable任务给线程池执行
        Runnable target=new MyRunnable();
//        pool.execute(target);   //加入新任务：会创建1个新线程，处理这个任务，并自动执行
//        pool.execute(target);
        pool.execute(new MyRunnable("1号"));
        pool.execute(new MyRunnable("2号"));
        pool.execute(new MyRunnable("3号"));
        pool.execute(new MyRunnable("4号"));
        pool.execute(new MyRunnable("5号"));
        pool.execute(new MyRunnable("6号"));
        pool.execute(new MyRunnable("7号"));
        pool.execute(new MyRunnable("8号"));


        //3.
    }
}
