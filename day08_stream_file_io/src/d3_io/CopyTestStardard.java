package d3_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyTestStardard {
    public static void main(String[] args) {
        //目标：使用字节流完成文件的复制
        //D:\code\huangpupro01\haha1.txt
        try{
            //1.创建一个文件字节输入流与源文件接通
            InputStream is=
                    new FileInputStream("D:\\code\\huangpupro01\\haha1.txt");

            //2.创建一个文件字节输出流与目标文件接通
            OutputStream os=
                    new FileOutputStream("D:\\code\\huangpupro01\\haha1.txt");

            //3.开始定义文件字节数组转移数据
            byte[] buffer=new byte[1024];

            //4.开始转移字节到目标文件
            int len;
            while((len=is.read(buffer))!=-1){
                os.write(buffer,0,len);
            }
            os.close();
            is.close();
            System.out.println("复制完成");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
