/*
五、代码题：
第一题：分析以下需求，并用代码实现
训练目标：
掌握java中多线程基本使用
需求描述：
有100份礼品,小红,小明两人同时发送,当剩下的礼品小于10份的时候则不再送出,利用多线程模拟该过程并将线程的名称打印出
来。并最后在控制台分别打印小红，小明各自送出多少分礼物。
I
第二题：分析以下需求，并用代码实现
训练目标：
掌握java中多线程基本使用
需求描述：
有一个抽奖池，该抽奖池中存放了奖励的金额，该抽奖池中的奖项为 {10，5，20，50，100，200，500，800，2，80，300，700}；
创建两个抽奖箱（线程)设置线程名称分别为“抽奖箱1”，“抽奖箱2”，随机从抽奖池中获取奖项元素并打印在控制台上，格式如下：
1.每次抽出一个奖项就打印一个(随机)
抽奖箱1 又产生了一个 10 元大奖
抽奖箱1 又产生了一个 100 元大奖
抽奖箱1 又产生了一个 200 元大奖

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo1 {
    public static void main(String[] args) throws Exception {
        List<String> giftList= new ArrayList<>();
        String[] giftNames={"口红","香水","护肤品","包包","人民币","房子","钱"};
        Random r=new Random();

        for(int i=0;i<100;i++){
            String gift=giftNames[r.nextInt(giftNames.length)]+(i+1);
            giftList.add(gift);
        }

        Thread xm=new SendThread(giftList,"小明");
        Thread xh=new SendThread(giftList,"小红");


        xh.start();
        xm.start();
        xm.join();
        xh.join();



        System.out.println(((SendThread) xm).getCount());
        System.out.println(((SendThread) xh).getCount());



    }
}
