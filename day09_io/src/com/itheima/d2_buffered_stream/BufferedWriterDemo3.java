package com.itheima.d2_buffered_stream;

import java.io.*;

public class BufferedWriterDemo3 {
    public static void main(String[] args) {
        //目标：掌握缓冲字符输出流的使用
        //1.创建一个文件字符输出流管道与目标文件接通

        try(
                Writer os = new FileWriter("haha1.txt");
                BufferedWriter bw=new BufferedWriter(os);
        ) {
            //2.写字符数据出去
            //写一个字符出去
            bw.write('a');

            //写一个字符串出去
            bw.write("邓丹我爱你~~");

            //写字符串的一部分出去
            bw.write("好好加油，去清华读博，试一试嘛，搏一搏，单车变摩托",0,10);
            //
            bw.close();


        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("程序运行结束！");
        }


    }
}
