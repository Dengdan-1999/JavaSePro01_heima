package d3_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //目标：掌握文件字节输入流每次读取多个字节

        //1.创建文件字节输入流管道与源文件接通
        InputStream fileInputStream=new FileInputStream("D:\\code\\huangpupro01\\haha.txt");


        //2.开始读取数据到字节数组，返回读取的字节数，如果没有数据可读，返回-1
        byte[] bs=new byte[16];
        int a=fileInputStream.read(bs);
        System.out.println(bs);
//        for(byte b:bs){
//            System.out.println((char)b);
//        }
        //3.循环改进
        while(a!=-1){
            for(byte b:bs){
                System.out.println((char)b);
            }
            a=fileInputStream.read(bs);

        }

        //4.关闭流
        fileInputStream.close();
    }
}
