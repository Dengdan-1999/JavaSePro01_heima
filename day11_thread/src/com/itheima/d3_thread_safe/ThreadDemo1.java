package com.itheima.d3_thread_safe;
/*
取钱案例
需求：小明和小红是一对夫妻，他们有一个共同的账户，余额是10万元，模拟2人同时去取钱10万。
分析： ①：需要提供一个账户类，接着创建一个账户对象代表2个人的共享账户。
     ②：需要定义一个线程类（用于创建两个线程，分别代表小明和小红）。
     ③：创建2个线程，传入同一个账户对象给2个线程处理。
     ④：启动2个线程，同时去同一个账户对象中取钱10万。

 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        //

        Account account=new Account("共同账户",123456,
                "666666",100000);
        Thread t1=new MyThread(account,"小明");
        Thread t2=new MyThread(account,"小红");
        t1.start();
        t2.start();






    }
}
