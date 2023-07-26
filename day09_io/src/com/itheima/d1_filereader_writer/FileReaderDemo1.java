package com.itheima.d1_filereader_writer;

import java.io.*;

public class FileReaderDemo1 {
    public static void main(String[] args) throws IOException {
        Reader r=new FileReader("haha.txt");
        int n=r.read();
        System.out.println(n);
        System.out.println((char)n);
        Writer w=new FileWriter("haha1.txt");
        w.write(97);
        w.close();
        r.close();

        char[] buffer=new char[1024];




    }
}
