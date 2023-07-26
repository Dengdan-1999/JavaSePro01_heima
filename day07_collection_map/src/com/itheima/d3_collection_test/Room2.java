package com.itheima.d3_collection_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Room2 {
    private List<Card> allCards=new ArrayList<>();
    //实例代码块进行初始化
    {
        //1.做牌
        //点数：个数确定了，类型确定了，用数组装
        String[] sizes={"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        //花色：个数确定了，类型确定了，用数组装
        String[] colors={"@", "#", "$", "%"};

        //创建牌对象封装点数和花色
        int index=0;
        for(String size:sizes){
            index++;
            for(String color:colors){
                //创建牌对象
                Card card=new Card(index,size,color);
                allCards.add(card);
            }
        }

        //单独创建大小王
        Card c1=new Card("大王","");
        Card c2=new Card("小王","");
        Collections.addAll(allCards,c1,c2);
        System.out.println("新牌:"+allCards);

    }

    public void start(){
        //2.洗牌
        Collections.shuffle(allCards);
        System.out.println("洗牌后："+allCards);

        //3.发牌
        List<Card> linghuchong=new ArrayList<>();
        List<Card> jiuMozhi=new ArrayList<>();
        List<Card> renYingYing=new ArrayList<>();

        //依次发出51张牌
        for(int i=0;i<allCards.size()-3;i++){
            //拿到当前遍历到的牌对象
            Card card=allCards.get(i);
            if(i%3==0){
                linghuchong.add(card);
            }else if(i%3==1){
                jiuMozhi.add(card);
            }else if(i%3==2){
                renYingYing.add(card);
            }
        }

        //拿到最后三张底牌
        List<Card> lastThreeCards=allCards.subList(allCards.size()-3,allCards.size());

        //4.抢地主
        //让任盈盈抢地主
        renYingYing.addAll(lastThreeCards);

        //5.对玩家手中的牌进行排序
        sortCards(linghuchong);
        sortCards(jiuMozhi);
        sortCards(renYingYing);

        //6.看牌
        System.out.println("令狐冲的牌:"+linghuchong);
        System.out.println("任盈盈的牌:"+renYingYing);
        System.out.println("鸠志摩的牌:"+jiuMozhi);
        System.out.println("底牌:"+lastThreeCards);


    }

    private void sortCards(List<Card> cards){
        //
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o2.getIndex()-o1.getIndex();
            }
        });
    }
}
