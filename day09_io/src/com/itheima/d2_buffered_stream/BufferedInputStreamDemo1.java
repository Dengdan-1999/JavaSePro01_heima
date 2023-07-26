package com.itheima.d2_buffered_stream;

import java.io.*;

public class BufferedInputStreamDemo1 {
    public static void main(String[] args) {
        //目标：使用字节缓冲流提升原始字节流读写数据的性能

        try {
            //1.创建一个文件字节输入流与源文件接通
            InputStream is=new FileInputStream("haha.txt");
            //把低级的字节数据输入流包装成高级的缓冲字节输入流
            BufferedInputStream bis=new BufferedInputStream(is);

            //2.创建一个文件字节输出流与目标文件接通
            OutputStream os=new FileOutputStream("haha1.txt");

            //把低级的字节数据输出流包装成高级的缓冲字节输出流
            BufferedOutputStream bos=new BufferedOutputStream(os);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }




    }
}
