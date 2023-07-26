package com.itheima.d5_regex;

public class RegexTest2 {
    public static void main(String[] args) {
        //1.字符类(只能匹配单个字符)
        System.out.println("a".matches("[abc]"));
        System.out.println("e".matches("[abcd]"));

        System.out.println("d".matches("[^abc]"));
        System.out.println("a".matches("[^abc]"));

        System.out.println("a".matches("[a-zA-Z]"));
        System.out.println("2".matches("[a-zA-Z]"));

        System.out.println("a".matches("[a-z&&[^bc]]"));
        System.out.println("b".matches("[a-z&&[^bc]]"));

        System.out.println("ab".matches("[a-zA-Z0-9]"));

        //2.预定义字符(只能匹配单个字符)
        System.out.println("徐".matches("."));
        System.out.println("徐然".matches("."));

        //在Java中，\有特殊用途的，如\t,\n
        System.out.println(" ".matches("\\d"));
        System.out.println("2".matches("\\d"));
        System.out.println("12".matches("\\d"));

        System.out.println(" ".matches("\\s"));
        System.out.println("徐".matches("\\s"));
        System.out.println("a".matches("\\s"));
        System.out.println("徐".matches("\\S"));

        System.out.println("a".matches("\\w"));
        System.out.println("$".matches("\\W"));
        System.out.println("&".matches("\\w"));

        System.out.println("a1".matches("\\w"));
        System.out.println("123456".matches("\\d"));

        System.out.println("====================================");
        //3.数量词：?(表示0或1个),*(表示0或多个),+(表示1或多个),
        // {n}(表示正好n个),{n,}(表示至少n个),{n,m}(表示n个到m个)
        /*
        System.out.println("a".matches("\\w?"));
        System.out.println("".matches("\\w?"));
        System.out.println("abc".matches("\\w?"));
        System.out.println("~~~~~~");
        System.out.println("a".matches("\\w*"));
        System.out.println("".matches("\\w*"));
        System.out.println("abc".matches("\\w*"));
        System.out.println("~~~~~~");
        System.out.println("a".matches("\\w+"));
        System.out.println("".matches("\\w+"));
        System.out.println("abc".matches("\\w+"));
        System.out.println("~~~~~~");


        System.out.println("a".matches("\\w{3}"));
        System.out.println("a".matches("\\w{3}"));
        System.out.println("abc".matches("\\w{3}"));
        System.out.println("~~~~~~");
        System.out.println("abc".matches("\\w{3,}"));
        System.out.println("abcde".matches("\\w{3,}"));
        System.out.println("ab".matches("\\w{3,}"));
        System.out.println("~~~~~~");
        System.out.println("a".matches("\\w{1,6}"));
        System.out.println("abcdef".matches("\\w{1,6}"));
        System.out.println("abcdefg".matches("\\w{1,6}"));
 */

        //4.其他几个常用的符号：(?!)忽略大小写，|或，()分组
        System.out.println("abc".matches("(?!)abc"));
        System.out.println("Abc".matches("(?!)abc"));
        System.out.println("aBc".matches("a((?!)b)c"));
        System.out.println("Abc".matches("a((?!)b)c"));

        //需求1：要求要么是3个小写字母，要么是3个数字
        System.out.println("abc".matches("\\d{3}|[a-z]{3}"));
        System.out.println("123".matches("\\d{3}|[a-z]{3}"));
        System.out.println("aAc".matches("\\d{3}|[a-z]{3}"));

        //需求2：必须是“我爱”开头，中间可以是至少一个“编程”，最后至少是1个“666”
        System.out.println("我爱编程编程666666".matches("我爱(编程)+(666)+"));
        System.out.println("我爱编程编程6666666".matches("我爱(编程)+(666)+"));//false

    }
}
