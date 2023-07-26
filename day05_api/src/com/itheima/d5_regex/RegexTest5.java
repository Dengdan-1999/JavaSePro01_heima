package com.itheima.d5_regex;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest5 {
    public static void main(String[] args) {
        //正则表达式练习：把一个邮箱的用户名爬取出来
        String data=
                "来黑马程序员学习Java,"+
                "电话：1851251675818512508907"+
                "或者联系邮箱：طoصi@itcast.cn"+
                "座机电话：01036517895,010-98951256"+
                "邮箱oz@itcast.cn,"+
                "邮箱2 dlei0009@163.com,"+
                "热线电话：400-618-9090，400-618-4000,"+
                "4006184000,4006189090";

        //1.创建一个规则匹配对象，封装正则表达式
        Pattern p= Pattern.compile("(.+)@\\w{2,}(\\.\\w{2,})+");//这里这个正则匹配表达式写错了！！

        //2.把内容和匹配规则建立联系，得到一个匹配器对象
        Matcher m=p.matcher(data);

        //3.使用匹配器对象，开始爬取内容
        while(true){
            String rs=m.group();
            System.out.println(rs);
        }


    }
}
