package com.itheima.d4_transfer_stream;

import java.io.*;

public class InputStreamReader {
    public static void main(String[] args) throws IOException {
        //目标：解决不同编码时，字符流读取文本内容乱码的问题
        Reader r=new FileReader("haha.txt");
        BufferedReader br=new BufferedReader(r);
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }

        //解决上面的乱码
        /*
        InputStream is=new FileInputStream("haha.txt");
        Reader r2=new java.io.InputStreamReader(is,"ASCII");
        char[] buffer=new char[1024];
        int n;
        while((n=r2.read(buffer))!=-1){
            System.out.println(buffer);
        }

         */

        //目标：掌握字符输出转换流，可以指定写出去的字符编码
        //1.创建一个文件字节输出流通向目标文件
        OutputStream os=new FileOutputStream("haha.txt");

        //2.把原始的输出流转换成字符输出流
        Writer osw=new OutputStreamWriter(os,"GBK");


        //3.包装成缓冲字符输出流
        BufferedWriter bw=new BufferedWriter(osw);

        bw.write("我爱你中国abc");
        bw.write("我爱你中国abc");
        bw.write("我爱你中国abc");

        bw.close();










    }
}
