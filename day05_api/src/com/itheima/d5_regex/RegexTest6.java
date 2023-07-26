package com.itheima.d5_regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
//贪婪匹配和非贪婪匹配我还是没有搞懂
public class RegexTest6 {
    public static void main(String[] args) {
        //目标：了解使用正则表达式去文本中爬取想要的内容
        String data="1张无忌是武林第一高手，2赵敏是蒙古第一美人，3周芷若是峨眉最美掌门人，" +
                "4小昭是昆仑第一美人，5殷离是桃花岛第一美人，6紫衫龙王是明教第一美人";

        //1.指定爬取规则对象，设置匹配规则
        String regex1="\\d+(.{1,10})是";

        Pattern p= Pattern.compile(regex1);

        //2.让内容和爬取规则建立关系，得到一个匹配器对象
        Matcher matcher=p.matcher(data);

        //3.开始使用匹配对象，开始爬取内容
        while(matcher.find()){
            //把爬取到的内容提取出来
//            String rs1=matcher.group(1);// 只要爬取的第一组内容，非贪婪匹配
            String rs2=matcher.group(); // 这时是贪婪匹配,b不对，这里的贪婪和非贪婪匹配不对

//            System.out.println(rs1);

            System.out.println(rs2);
        }
    }
}
