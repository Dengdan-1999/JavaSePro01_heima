package d2_file;

import java.io.File;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //目标：改变某个文件夹下视频的序号，要求从19开始
        //        C:\Users\邓dan\Desktop\公主照片
        File f=new File("C:\\Users\\邓dan\\Desktop\\公主照片");
//        System.out.println(f.exists());

        //1.拿到下面全部的视频，一级文件对象
        File[] files=f.listFiles();
        for(File file:files){
            System.out.println(file);
        }

//        将其中两个命名不规范的文件改名
//        File f1=new File("C:\\Users\\邓dan\\Desktop\\公主照片\\公主高中毕业照.webp")
//        File f1=new File("C:\\Users\\邓dan\\Desktop\\公主照片\\公主高中毕业照2.pbg")
        /*
        File f1=new File("C:\\Users\\邓dan\\Desktop\\公主照片\\公主高中毕业照.webp");
        File f2=new File("C:\\Users\\邓dan\\Desktop\\公主照片\\19.webp");
        f1.renameTo(f2);
        File f3=new File("C:\\Users\\邓dan\\Desktop\\公主照片\\公主高中毕业照2.png");
        File f4=new File("C:\\Users\\邓dan\\Desktop\\公主照片\\20.png");
        f3.renameTo(f4);

        File f5=new File("C:\\Users\\邓dan\\Desktop\\公主照片");
        File[] names=f5.listFiles();
        System.out.println(Arrays.toString(names));
         */



        //2.一个一个的找
        String name;
        String newName;
        String num;
        String firstName;
        String lastName;



        for(File file:files){
            name=file.getName();
            firstName=name.split("\\.")[0];
            lastName=name.split("\\.")[1];
            System.out.println(name);
            newName=(Integer.valueOf(firstName)+10)+"."+lastName;
            System.out.println(newName);

            File newFile=new File("C:\\Users\\邓dan\\Desktop\\公主照片\\"+newName);
            file.renameTo(newFile);

        }
        System.out.println("重新命名完成~~");
        String[] names=f.list();
        System.out.println(Arrays.toString(names));

        //3.拿到它的名字，改成新名字

        //4.正式改名


    }
}
