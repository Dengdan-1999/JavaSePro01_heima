package d3_io;

import java.io.*;

public class CopyTest {
    public static void main(String[] args) throws IOException {
        //目标：使用字节流完成文件的复制
        //D:\code\huangpupro01\haha1.txt，将这个文件复制为D:\code\huangpupro01\haha1_copy.txt

        //
        OutputStream os=new FileOutputStream("D:\\code\\huangpupro01\\haha1_copy.txt");
        InputStream is=new FileInputStream("D:\\code\\huangpupro01\\haha1.txt");

        File f=new File("D:\\code\\huangpupro01\\haha1.txt");
        int len=(int)f.length();
        System.out.println("len="+len);

        byte[] buffer=new byte[len];

        int b=is.read(buffer);

        while(b!=-1){
            os.write(buffer,0,len);
            System.out.println("读取的字节数为:"+b);
            b=is.read(buffer);

        }
        os.close();
        is.close();



    }
}
