package d2_file;

import java.io.File;

public class searchFile2 {
    public static void main(String[] args) {
        //
    }

    public static void searchFile(File dir, String fileName){
        //1.判断参数的合法性
        if(dir==null||fileName==null||!dir.exists()||dir.isFile()){
            return;
        }
        //2.提取全部的一级文件对象数组
        File[] files=dir.listFiles();

        //3.判断是否存在一级文件对象
        if(files==null||files.length==0){
            return;
        }

        //4.遍历一级文件对象
        for(File file:files){
            //5.判断file是否是文件
            if(file.isFile()){
                if(file.getName().contains(fileName)){
                    System.out.println("找到了："+file.getAbsolutePath());
                }
            }
            else{
                //遍历到文件夹，基线进入到这个文件夹递归寻找
                searchFile(file,fileName);
            }
        }


    }
}
