package d2_file;

import java.io.File;
import java.util.Arrays;

public class FileTest4 {
    public static void main(String[] args) {
        //目标：掌握File遍历文件夹
        File f1=new File("D:\\code\\huangpupro01");
        //1.获取当前目录下所有的“一级文件名称”到一个字符串数组中去返回
        String[] names=f1.list();
        for(String s:names){
            System.out.println(s);
        }

        //2.获取当前目录下所有的“一级文件对象”到一个文件对象数组去返回（重点）
        File[] filenames=f1.listFiles();
        for(File file:filenames){
            System.out.println(file);
        }
        System.out.println("====================================");
//        System.out.println(Arrays.toString(filenames));

        //3.修改文件名
        File f2=new File("D:\\code\\huangpupro01\\haha.txt");
        File fnew=new File("D:\\code\\huangpupro01\\haha2.txt");
        f2.renameTo(fnew);
    }
}
