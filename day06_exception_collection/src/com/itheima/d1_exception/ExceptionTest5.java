package com.itheima.d1_exception;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionTest5 {
    public static void main(String[] args) {
        //目标：掌握异常的处理方式一：底层抛出异常给最外层，最外层集中捕获并记录异常，然后响应合适信息给用户
        try{
            parseDate("2021-11-11 11:11:11");
            System.out.println("执行成功");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("您的功能执行失败了~请确认~");
        }
    }

    public static void parseDate(String s) throws Exception{
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d=sdf.parse(s);
        System.out.println(d);

        InputStream is=new FileInputStream("./meinv.txt");
    }
}
