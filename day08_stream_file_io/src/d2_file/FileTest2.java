package d2_file;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileTest2 {
    public static void main(String[] args) {
        //目标：掌握File提供的判断文件类型，获取文件信息功能

        //1.创建文件对象，指代某个文件
        File f1=new File("D:\\code\\huangpupro01\\haha1.txt");
        File f2=new File("D:\\code\\huangpupro01\\haha2.txt");


        //2.判断当前文件是否存在
        System.out.println(f1.exists());

        //3.判断当前文件指代的是否是文件
        System.out.println(f1.isFile());

        //4.判断当前文件对象指代的是否是文件夹
        System.out.println(f1.isDirectory());

        //5.获取文件的名称
        System.out.println(f1.getName());

        //6.获取文件的大小，返回字节个数
        System.out.println(f1.length());

        //7.获取文件的最后修改时间
        long time=f1.lastModified();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a");
        System.out.println(f1.lastModified());
        System.out.println(sdf.format(time));

        //8.获取创建文件对象时，使用的路径
        System.out.println(f1.getPath());

        //9.获取绝对路径
        System.out.println(f1.getAbsoluteFile());

    }
}
