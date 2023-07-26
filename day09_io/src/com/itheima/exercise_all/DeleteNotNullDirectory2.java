package com.itheima.exercise_all;
import java.io.File;

public class DeleteNotNullDirectory2 {
    public static void main(String[] args) {
        //目标：删除非空文件夹，独立功能独立成方法
        File dir=new File("C:\\Users\\邓dan\\Desktop\\测试IO流文件夹改名");

    }

    public static void deleteDir(File dir){
        if(dir==null||!dir.exists()){
            return;
        }

        if(dir.isFile()){
            dir.delete();
            return;
        }

        //1.dir存在并且是文件夹，拿里面的一级文件对象
        File[] files=dir.listFiles();
        if(files==null){
            return;
        }

        //2.这是一个有内容的文件夹，干掉里面的内容，再干掉自己
        for(File file:files){
            if(file.isFile()){
                file.delete();
            }else{
                deleteDir(file);
            }
        }
        dir.delete();
    }

}
