package com.itheima.exercise_all;
//没有写出来，哭唧唧，好难~~
//这是一个买啤酒的案例，要求计算最终能够买到多少瓶啤酒，剩下多少个盖子，多少个空瓶子
//题目：啤酒2元一瓶，4个酒盖可以兑换1瓶啤酒，2个空瓶可以兑换1瓶酒，、
// 请问10元最终可以喝多少瓶酒，剩余多少个空瓶和盖子？
//显然这是一个递归的问题

import java.sql.Time;

public class BuyBeerDemo {
    //记录钱的数量
    public static int MONEY=10;
    //记录总共能够喝的酒的数量
    public static int TOTALBEERS=0;
    //记录剩下的空瓶子数量
    public static int lastBottles;
    //记录剩下的空盖子数量
    public static int lastCovers;

    public static void main(String[] args) throws Exception {





    }

    public static void buyBeer(int lastBottles,int lastCovers) throws Exception {
        //记录总共买了多少瓶酒
        if(MONEY>=2){
            TOTALBEERS+=(MONEY/2);
            MONEY=MONEY%2;

        }


        //获得多少个瓶子和盖子
        lastBottles+=MONEY/2;
        lastCovers+=MONEY/2;


        if(lastBottles>=2){
            //空瓶子换酒
            TOTALBEERS+=lastBottles/2;  //瓶子数量增加
            lastCovers+=lastBottles/2;  //盖子数量增加
            lastBottles=lastBottles%2;   //换完酒还剩下多少个空瓶子
        }
        if(lastCovers>=4){
            //瓶盖换酒
            TOTALBEERS+=lastCovers/4;


        }

    }
}
