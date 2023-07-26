package com.itheima.exercise_all;

import java.io.File;
//这个例子还是没有写对，我这个代码写得不好
//删除非空文件夹的练习，妈的
public class DeleteNotNullDirectory {
    public static void main(String[] args) {
        //目标：删除非空文件夹，独立功能独立成方法
        //C:\Users\邓dan\Desktop\测试IO流文件夹
        File f=new File("C:\\Users\\邓dan\\Desktop\\测试IO流文件夹改名");
        System.out.println(f.exists());
        deleteFile(f);
        System.out.println("文件已经成功删除");




    }

    //根据文件对象来删除文件的方法
    public static void deleteFile(File file){
        //如果文件不存在或者文件长度为0
        if(!file.exists()||file.length()==0){
            return;
        }
        //如果文件是文件，直接删除并返回
        if(file.isFile()){
            file.delete();
            return;
        }
        //如果文件是空文件夹
        if(file.length()==0){
            file.delete();
            return;
        }
        // 如果是文件夹并且非空，要遍历其中每个内容
        File[] files=file.listFiles();
        for(File f:files){
            if(f.isFile()){
                f.delete();
            }
            else{
                deleteFile(f);
                f.delete();
            }

        }
        return;

    }
}
