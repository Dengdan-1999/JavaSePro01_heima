package com.itheima.d5_dataOutputStream;

import java.io.*;

public class DataInputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        //目标：掌握数据输出流写数据出去的特点，可以写数据和其类型，而且后期可以读取出去
        OutputStream f=new FileOutputStream("D:\\code\\huangpupro01\\haha.txt");
        DataOutputStream dos=new DataOutputStream(f);

        //1.写数据和类型出去
        dos.writeInt(666);
        dos.writeBoolean(true);
        dos.writeUTF("妈拉个巴子");


        //2.
        dos.close();

    }
}
