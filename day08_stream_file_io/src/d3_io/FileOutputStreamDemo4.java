package d3_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamDemo4 {
    public static void main(String[] args) throws IOException {
        //目标：文件字节输出流的使用
        //1.创建一个文件字节输出流管道与目标文件接通
        OutputStream os=
                new FileOutputStream("D:\\code\\huangpupro01\\haha1.txt");

        //选择以追加方式创建流对象
        OutputStream os2=
                new FileOutputStream("D:\\code\\huangpupro01\\haha1.txt",true);

        //2.开始写字节数据出去
        os.write(97);
        os.write('我');

        //每次写一个字节数组的数据出去
        byte[] bytes="我爱你中国".getBytes();
        os.write(bytes);

        //写一个字节数组的一部分内容
        //参数1：字节数组
        //参数2：写出去的第一个字节的索引
        //参数3：总共写出去多少个字节
        byte[] bytes2="我爱你中国abc".getBytes();
        byte[] bytes3="邓丹丹中国abc".getBytes();
        os2.write(bytes3,0,9);

        //3.关闭流文件
        os.close();
        os2.close();
    }
}
