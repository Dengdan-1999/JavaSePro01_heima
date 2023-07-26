package d3_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream2_stardard {
    public static void main(String[] args) throws IOException {
        InputStream is=new FileInputStream("D:\\code\\huangpupro01\\haha.txt");
        byte[] buffer=new byte[3];

        int len=is.read(buffer);
        System.out.println("读取了"+len+"个字节~");
        String rs=new String(buffer);
        System.out.println(rs);

        int len2=is.read(buffer);
        System.out.println("读取了"+len2+"个字节~~");
        String rs2=new String(buffer);
        System.out.println(rs2);

        //读取多少就应该倒出多少
        String rs3=new String(buffer,0,len2);
        System.out.println(rs3);

        //3.循环改进
        int len3;  //记录每次读取了多少个字节
        while((len3=is.read(buffer))!=-1){
            //读取多少就应该倒出多少
            String rs4=new String(buffer,0,len3);
            System.out.println(rs4);
        }
        is.close();



    }
}
