package com.itheima.d1_filereader_writer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderDemo2 {
    public static void main(String[] args) throws IOException {
        //目标：文件字符输入流的使用，每次读取多个字符
        //1.创建一个文件字符输入流管道与源文件接通
        try(Reader r=new FileReader("haha.txt");){
            char[] buffer=new char[1024];

            int n=r.read(buffer);
            System.out.println(n);
            System.out.println((char)n);

            System.out.println(buffer);

            r.close();
        }catch(Exception e){
            e.printStackTrace();
        }


    }
}
