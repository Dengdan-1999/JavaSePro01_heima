package com.itheima.d4_synchronized_code;

public class Account {
    String userName;
    private int cardID;
    private String password;
    private int money;

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

        System.out.println("this.money=" + this.money + ", money=" + money);

        synchronized ("同步锁也可以上在这里") {
            if (this.money >= money) {
                System.out.println("当前来取钱的人是：" + Thread.currentThread().getName()
                        + "卡里余额为：" + this.money + ",可以取钱");
                this.money = this.money - money;
            } else {
                System.out.println("卡里余额为：" + this.money + "，不能够取钱");
            }
            System.out.println("卡里余额为：" + this.money);
        }
    }

}
