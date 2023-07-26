package com.itheima.d7_interface;

public class PingPongMan implements Law,Sport{
    private String name;
    public PingPongMan(String name){
        this.name=name;
    }

    @Override
    public void rule(){
        System.out.println(name+"==要遵纪守法，不能赌博");
    }
    @Override
    public void run(){
        System.out.println(name+"要坚持跑步训练");
    }
    @Override
    public void competition(){
        System.out.println(name+"必须参加世界大赛");
    }
}
