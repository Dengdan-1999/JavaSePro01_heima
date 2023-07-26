package com.itheima.d5_dataOutputStream;
//数据输入流：用于读取数据输出流写出去的数据

import java.io.*;

public class DataOutputStreamDemo {
    public static void main(String[] args) throws Exception {

        //目标：掌握数据输入流的使用
        InputStream is=new FileInputStream("haha.txt");
        DataInputStream dos=new DataInputStream(is);


        int a=dos.readInt();
        System.out.println(a);
        boolean b=dos.readBoolean();
        System.out.println(b);
        String c=dos.readUTF();
        System.out.println(c);



    }
}
