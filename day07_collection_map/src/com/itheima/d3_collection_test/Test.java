package com.itheima.d3_collection_test;

/*
    点数："3","4","5","6","7","8","9","10","J","Q","K","A","2"
    花色："@"，"#"，"$"，"%"
    大小王："大王"，"小王"
    斗地主：发出51张牌，剩下3张做为底牌，

// 1、 每张牌是一个对象，设计一个牌类。
// 2、设计一个房间类，用于创建房间对象，开启游戏。
 */

public class Test {
    public static void main(String[] args) {
        Room room=new Room();
        Room.start();
    }
}
