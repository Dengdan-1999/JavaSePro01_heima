package com.itheima.d4_transfer_stream;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class PrintStreamDemo1 {
    public static void main(String[] args) {
        //目标：打印流：方便、高效的写数据出去
        //1.创建打印流管道通向目标文件
        try (
                OutputStream os = new FileOutputStream("haha.txt");
                PrintStream ps = new PrintStream(os);
        ) {
            //2.打印数据功能
            ps.println(97);
            ps.println('a');
            ps.println(99.5);
            ps.println(true);
            ps.println("我爱你中国！");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
