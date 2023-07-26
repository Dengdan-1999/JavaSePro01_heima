package d3_io;

import jdk.internal.util.xml.impl.Input;

import java.io.*;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //目标：掌握文件字节输入流每次读取一个字节的形式
        //FileInputStream,文件字节输入流，以内存为基准，
        // 可以把磁盘文件中的数据以字节的形式读入到内存中去

        //1.创建文件字节输入流管道与源文件接通
        File f=new File("D:\\code\\huangpupro01\\haha2.txt");
        InputStream fileInputStream=new FileInputStream(f);
        InputStream fileStream= new FileInputStream("D:\\code\\huangpupro01\\haha2.txt");

        //2.开始读取字节
//        fileInputStream.read();
//        System.out.println(fileInputStream.read());
        int b1=fileInputStream.read();
        System.out.println(b1);
        System.out.println((char)b1);

        System.out.println("======");
        byte[] bs=new byte[6];
        System.out.println(fileInputStream.read(bs));



        //3.使用循环改进
        int b;//用于记住读取的字节
        while((b=fileInputStream.read())!=-1)
        {
            System.out.println((char)b);
        }
        //4.拓展：每次读取一个字节是垃圾代码，性能差！读取汉字输出无法避免乱码的！
        //流用完毕之后，记得关闭
        fileInputStream.close();
    }
}
