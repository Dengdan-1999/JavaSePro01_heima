package com.itheima.d3_collection_test;

import java.util.*;

public class Room {
    public static void start() {
        String[] colors = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] sizes = {"@", "#", "$", "%"};
        ArrayList<Poker> pokers = new ArrayList<>();
        //给游戏房间准备一副牌
        int k = 0;
        for (int i = 0; i < colors.length; i++) {
            k++;
            for (int j = 0; j < sizes.length; j++) {
                Poker poker = new Poker(colors[i], sizes[j], k);
                pokers.add(poker);
            }
        }
        //将大小王加入牌中
        Poker poker1=new Poker("大王","",15);
        Poker poker2=new Poker("小王","",14);
        Collections.addAll(pokers,poker1,poker2);

        //看看牌能不能成功准备
        for(Poker p:pokers){
            System.out.print(p+" ");
        }

        //现在进行洗牌
        System.out.println("====================================");
        Collections.shuffle(pokers);

      for(Poker p:pokers){
          System.out.print(p+" ");
      }
      //现在进行发牌，假设有三个玩家，给他们发牌，假设周芷若是地主
        ArrayList<Poker> 张无忌=new ArrayList<>();
        ArrayList<Poker> 周芷若=new ArrayList<>();
        ArrayList<Poker> 赵敏=new ArrayList<>();


        int i=0;
        for(;i<51;i++){
            Poker p=pokers.get(i);
            if(i%3==0){
                张无忌.add(p);
            }
            else if(i%3==1){
                周芷若.add(p);
            }
            else{
                赵敏.add(p);
            }
        }

        System.out.println("i="+i);
        System.out.println("pokers.size()="+pokers.size());
        周芷若.add(pokers.get(51));
        周芷若.add(pokers.get(52));
        周芷若.add(pokers.get(53));
        System.out.println("发牌成功");

//        //给牌排序
//       Collections.sort(张无忌);
//       Collections.sort(周芷若);
//       Collections.sort(赵敏);


        //展示一下三人的牌
        ArrayList<Poker>[] n=new ArrayList[3];
        n[0]=张无忌;
        n[1]=周芷若;
        n[2]=赵敏;
        String[] names={"张无忌","周芷若","赵敏"};
        for(int j=0;j<3;j++){
            System.out.print(names[j]+": ");
            for(Poker p:n[j]){
                System.out.print(p+" ");
            }
            System.out.println();
        }








    }
}
