package com.itheima.exercise_all;
//不错不错，这个demo写成功了
import java.io.*;

public class CopyDirectoryDemo1 {
    public static void main(String[] args) throws Exception {
        //目标：将目标位置的文件复制到指定位置
        //C:\Users\邓dan\Desktop\东北大学C++课程资料
        //目标位置：D:\研一下课程资料
        /*
        File src=new File("C:\\Users\\邓dan\\Desktop\\东北大学C++课程资料");
        String name=src.getName();
        System.out.println(name);
        */

        copyDirectoryToDirectory("C:\\Users\\邓dan\\Desktop\\东北大学C++课程资料",
                "D:\\研一下课程资料");

    }

    public static void copyDirectoryToDirectory(String src, String des) throws Exception {
        File oldfile=new File(src);
        if(!oldfile.exists()){
            System.out.println("文件不存在");
            return;
        }
        String name=oldfile.getName();
        File newfile=new File(des+"\\"+name);
        newfile.mkdirs();

        //获取要复制的所有一级文件对象
        File[] files=oldfile.listFiles();
        //遍历要复制的文件对象
        for(File file:files){
            //如果是文本文件，直接复制
            if(file.isFile()){
                //创建目标文件对象
                String filename=file.getName();
                File targetfile=new File(des+"\\"+name+"\\"+filename);
                copyfile(file,targetfile);
            }
            //如果不是文本文件
            else{
                copyDirectoryToDirectory(src+"\\"+file.getName(),
                        des+"\\"+name+"\\"+file.getName());
            }
        }




    }

    //复制文本文件
    public static void copyfile(File fileFrom,File fileTo) throws Exception {
        InputStream is=new FileInputStream(fileFrom);
        OutputStream os=new FileOutputStream(fileTo);
        BufferedInputStream bis=new BufferedInputStream(is);
        BufferedOutputStream bos=new BufferedOutputStream(os);

        byte[] buffer=new byte[1024];
        int n;
        while((n=bis.read(buffer))!=-1){
            bos.write(buffer);
        }

        System.out.println(fileTo.getName()+"复制结束~");
        bis.close();
        bos.close();



    }

}
