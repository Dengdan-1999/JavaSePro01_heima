package com.itheima.d8_thread_pool;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    int n;
    public MyCallable(int n){
        this.n=n;
    }
    @Override
    public String call(){
        return Thread.currentThread().getName()+"输出："+n;
    }
}
