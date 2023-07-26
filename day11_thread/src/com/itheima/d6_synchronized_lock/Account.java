package com.itheima.d6_synchronized_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    String userName;
    private int cardID;
    private String password;
    private int money;

    Lock lock=new ReentrantLock();

    public long getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


    public Account(String userName, int cardID, String password,int money) {
        this.userName = userName;
        this.cardID = cardID;
        this.password = password;
        this.money=money;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getCardID() {
        return cardID;
    }

    public void setCardID(int cardID) {
        this.cardID = cardID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    //存钱
    public void deposit(int money){
       this.money+=money;
    }

    //取钱
    public void draw(int money) {
        //知道是谁来取钱
        String name = Thread.currentThread().getName();


        try {
            lock.lock();   //上锁

            System.out.println("this.money=" + this.money + ", money=" + money);

            if (this.money >= money) {
                System.out.println("当前来取钱的人是：" + Thread.currentThread().getName()
                        + "卡里余额为：" + this.money + ",可以取钱");
                this.money = this.money - money;
            } else {
                System.out.println("卡里余额为：" + this.money + "，不能够取钱");
            }
            System.out.println("卡里余额为：" + this.money);
        }finally{
            lock.unlock();      //解锁

        }
    }

}
