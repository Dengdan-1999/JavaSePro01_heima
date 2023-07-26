package d2_file;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        //目标：掌握File对象的创建，来代表具体的文件
        //1.创建File对象
//        File f1=new File("D:\\西班牙女王储照片集");
        File f2=new File("D:\\code\\huangpupro01");
//        System.out.println(f1.length());
        System.out.println(f2.length());

        //2.file对象可以代表文件，也可以代表文件夹
//        File f3=new File("D:\\西班牙女王储照片集\\公主高中毕业照");
        File f4=new File("D:\\code\\huangpupro01\\text.txt");
//        System.out.println(f3.exists());
        System.out.println(f4.exists());

        //3.file对象代表的文件路径可以是不存在的
        File f5=new File("D:\\code\\huangpupro01\\haha.txt");
        System.out.println(f5.exists());

        //4.File对象的路径可以支持绝对路径和相对路径
        //
        File f6=new File("./haha.txt");
        System.out.println(f6.exists());






    }
}
