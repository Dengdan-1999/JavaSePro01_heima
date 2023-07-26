package com.itheima.d5_synchronized_method;

public class MyThread extends Thread{
    private Account account;
    private int money;

    @Override
    public void run(){
        //1.取钱方法
        account.draw(100000);

        //2.存钱方法

    }





    public MyThread(Account account, String name){
        super(name);
        this.account=account;

    }


}
