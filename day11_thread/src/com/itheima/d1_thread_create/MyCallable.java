package com.itheima.d1_thread_create;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception{
            return ("子线程在执行，返回"+999);
        }
}
