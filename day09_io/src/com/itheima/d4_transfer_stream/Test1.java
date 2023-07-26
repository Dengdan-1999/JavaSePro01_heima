package com.itheima.d4_transfer_stream;

import java.io.*;

public class Test1 {
    public static void main(String[] args) {
        //目标：不同编码下，字符流读取文本内容的问题
        //代码编码：UTF-8,文件编码：UTF-9
        //代码编码：UTF-8,文件编码：ANSI,C:\Users\邓dan\Desktop\test.txt
        //1.定义原始的字符输入流


        try {
            Reader r=new FileReader("C:\\Users\\邓dan\\Desktop\\test.txt");
            String line;
            int n;
            char[] buffer=new char[1024];
            n=r.read(buffer);
            System.out.println(n);
            Writer w=new FileWriter("haha.txt");
            while(n!=-1){
                w.write(buffer);
                n=r.read(buffer);
            }
            w.close();
            r.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
