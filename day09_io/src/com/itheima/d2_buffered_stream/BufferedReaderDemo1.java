package com.itheima.d2_buffered_stream;

import java.io.*;

public class BufferedReaderDemo1 {
    public static void main(String[] args) {
        //目标：字符缓冲输入流的使用，提升原始字符输入流的读字符性能，多了按照行读取字符的能力
        try( //1.创建一个文件字符输入流管道与源文件接通
             Reader is=new FileReader("haha.txt");

             //2.把原始字符输入流包装成高级的缓冲字符输入流
             BufferedReader bis=new BufferedReader(is);
             )
        {
            /*
           char[] buffer=new char[1024];
           int len;//记录每次读取的字符个数
            while((len=bis.read(buffer))!=-1){
                String rs=new String(buffer,0,len);
                System.out.println(rs);
            }

             */

            //测试新增功能；按照行读
            String line;
            while((line=bis.readLine())!=null){
                System.out.println(line);
            }

        }catch (Exception e) {
           e.printStackTrace();
        }

    }
}
