package d2_file;

import java.io.File;

/*
    案例
    文件搜索
    在 Data (D:) 中搜索
    需求：从D:盘中，搜索“QQ.exe”这个文件，找到后直接输出其位置(或者运行)。
    分析：
    ① 先找出D:盘下的所有一级文件对象
    ② 遍历全部一级文件对象，判断是否是文件
    ③ 如果是文件，判断是否是自己想要的
    ④ 如果是文件夹，需要继续进入到该文件夹，重复上述过程
 */
public class searchFile {
    public static String searchFileName="12.jpg";
//    public static String parentPath = "D:\\code\\huangpupro01";
    public static String parentPath = "C:\\Users\\邓dan\\Desktop\\公主照片";

//    C:\Users\邓dan\Desktop\公主照片


    public static void main(String[] args) {
        //目标：练习文件搜索，模拟文件搜索的过程,这里以搜索Test.java文件为例，D:\code\huangpupro01
        //1.判断参数的合法性

        File f = new File(parentPath);
        File[] files = f.listFiles();
//        System.out.println(files[1].getName());

        findFile(files);


/*
        for (File file : files) {
            if (file.isFile()) {
                //如果是文件
                if (file.getName() == searchFileName) {
                    System.out.println("找到了目标文件！");
                    break;
                }
            } else {
                //是文件夹，则获取文件夹所有文件对象，重复循环
                File[] files2 = (new File(parentPath + "\\" + file.getName())).listFiles();

            }

        }
 */


    }

    public static void findFile(File[] files) {
        for (File file : files) {
            if (file.isFile()) {
                //如果是文件
                //注意，要用equals方法比较
//                System.out.println(file.getName()==searchFileName);
//                System.out.println(file.getName().equals(searchFileName));
                if (file.getName().equals(searchFileName)) {
                    System.out.println("找到了目标文件！");
                    break;
                }
            } else {
                //是文件夹，则获取文件夹所有文件对象，重复循环
                File[] files2 = (new File(parentPath + "\\" + file.getName())).listFiles();
                findFile(files2);
            }
        }
    }
}
