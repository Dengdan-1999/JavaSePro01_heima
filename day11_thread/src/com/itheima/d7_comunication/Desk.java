package com.itheima.d7_comunication;
//这个案例我竟然不会写，不会写
public class Desk {

    String contianer=null;
    public Desk() throws Exception {
        String name = Thread.currentThread().getName();
//
//        if(container==null) {
//            //做一个包子
//            container = name + "做了一个香喷喷的包子";
//            System.out.println(name + "来做了一个香喷喷的包子~~~");
//            //等待自己，唤醒别人
//            this.notifyAll();
//            this.wait();
//        }else{
//            //有包子，吃掉
//            this.notifyAll();
//            this.wait();
        }
//    }

    //小帅 有容
    public synchronized void get() throws Exception{
        String name=Thread.currentThread().getName();
//        if()
    }

}
