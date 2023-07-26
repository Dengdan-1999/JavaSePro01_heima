package com.itheima.d1_filereader_writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileReaderDemo3 {
    public static void main(String[] args) throws IOException {
        //目标：掌握文件字符输出流的使用
        //1.创建一个文件字符输出流管道与目标文件接通
        Writer w=new FileWriter("haha1.txt");

        //2.写字符数据出去
        w.write(99);

        //2.1 写一个字符出去
        w.write('a');

        //2.2 写一个字符串出去
        w.write("你好呀");

        //2.3 写字符串的一部分出去
        w.write("我还是想去清华大学，要不我拼一把，去清华念个博士",0,9);

        //换个行
        w.write('\n');

        //2.4写一个字符数组出去
        char[] buffer={'i','l','o','v','e',',','y','o','u'};
        w.write(buffer);

        //2.5写一个字符数组的一部分出去
        w.write(buffer,2,6);

        //2.6 必须刷新或者释放资源
        w.close();
    }
}
