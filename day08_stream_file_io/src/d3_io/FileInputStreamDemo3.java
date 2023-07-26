package d3_io;

import java.io.*;

public class FileInputStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //目标：学会如何使用文件字节输入流一次性读取完文本的全部字节
        //以此避免读取汉字乱码的问题
        //1.创建文件字节输入流管道与源文件接通
        InputStream is=
                new FileInputStream("D:\\code\\huangpupro01\\haha.txt");

        //2.定义一个字节数组与文件大小一样大
        File f=new File("D:\\code\\huangpupro01\\haha.txt");
        byte[] allbyte=new byte[(int)(f.length())];

        //3.开始装字节到字节数组中去
        int s=is.read(allbyte);
        System.out.println("文件大小："+f.length());
        System.out.println("读取字节数："+s);

        //4.输出字节数组的内容
        String rs=new String(allbyte);
        System.out.println(rs);

    }
}
