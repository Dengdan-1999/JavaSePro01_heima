package com.itheima.d2_buffered_stream;

import java.io.*;

public class TimeTest {
    public static void main(String[] args) {
        //目标：通过实现代码比较低级流与高级流的性能差异及本质区别

        //方法1：
        try(
                //1.创建一个低级字节输入流与源文件接通
                InputStream is=new FileInputStream("出师表.txt");
                //2.创建一个低级字节输出流与源文件接通
                OutputStream os=new FileOutputStream("haha.txt");

        ){
            long starttime=System.currentTimeMillis();
            //3.开始转移字节
            int b;
            while((b=is.read())!=-1){
                os.write(b);
            }
            is.close();
            os.close();

            long endtime=System.currentTimeMillis();
            System.out.println("总共用时："+(endtime-starttime)+"ms");

        }catch (Exception e) {

            e.printStackTrace();

        }

        //方法2：高级字符流
        try(
                InputStream is=new FileInputStream("出师表.txt");
                BufferedInputStream br=new BufferedInputStream(is);
                OutputStream os=new FileOutputStream("haha.txt",true);
                BufferedOutputStream bos=new BufferedOutputStream(os);




        ) {
            long starttime=System.currentTimeMillis();
            String line;
            int b;
            while((b=br.read())!=-1){
                bos.write(b);
            }
            bos.close();

            long endtime=System.currentTimeMillis();
            System.out.println("方法2总共花费时间:"+(endtime-starttime)+"ms");
        }
        catch (Exception e){
            e.printStackTrace();
        }

        //1.使用低级的字节输入流一个一个字节的拷贝，垃圾代码，慢的简直让人无法忍受，直接淘汰，禁止使用
        //2.使用低级的字节输入流一个一个字节数组的拷贝，相对还是比较慢，但是还能够勉强的接受
        //3.使用高级的缓冲字节输入流一个一个字节的拷贝，还是比较垃圾代码，慢的让人无法忍受，禁止使用
        //4.使用高级的缓冲字节输入流一个一个字节数组的拷贝，快男！yyds


    }
}
