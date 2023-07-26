package d2_file;

import java.io.File;

public class FileTest3 {
    public static void main(String[] args) {
        //1.创建一个新文件(文件内容为空)
        File f1=new File("D:\\code\\huangpupro01");


        //2.创建一个文件夹，用只能创建一级文件夹的方式
        File direc1=new File("D:\\code\\huangpupro01\\day_09_test");
        System.out.println(direc1.mkdir());

        //3.创建多级文件夹
        File direc2=new File("D:\\code\\huangpupro01\\day_10_test\\");
        System.out.println(direc2.mkdirs());

        //4.删除文件，或者空文件，注：不能删除非空文件夹
        File f2=new File("D:\\code\\huangpupro01\\haha.txt");
        f2.delete();

        //5.
    }
}
