package com.itheima.d4_synchronized_code;

public class MyThread extends Thread{
    private Account account;
    private int money;


    @Override
    public void run(){
        //1.取钱方法
//        synchronized (account) {   同步锁可以上在这里
            account.draw(100000);
//        }

        //2.存钱方法
        System.out.println("哈哈哈,当前在运行的线程是：" +
                ""+Thread.currentThread().getName());

    }





    public MyThread(Account account, String name){
        super(name);
        this.account=account;

    }


}
