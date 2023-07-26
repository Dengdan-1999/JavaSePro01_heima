package d2_file;

import java.io.File;
//这个代码我写得不对，有的地方出错了

public class deleteNotNullDirectory {
    public static int i=1;

    public static void main(String[] args) {
        //目标：练习删除非空文件夹
        //注：File默认不能删除非空文件夹，因此，需要遍历文件夹，先删除里面的内容，再删除文件夹
        String deleteFileName="D:\\code\\huangpupro01\\day08_stream_file_io\\src\\d2_file\\testDelete";

        File f=new File(deleteFileName);
        System.out.println(f.isDirectory());
        System.out.println(f.length());
        System.out.println(f.getAbsoluteFile());

//        File[] files=f.listFiles();



        deleteDirectory(f);


    }

    public static void deleteDirectory(File dir){
        System.out.println("第"+i+"次迭代~");
        i++;
        if(dir==null||!dir.exists()){
            return;
        }
        if(dir.length()==0){
            dir.delete();
        }

        File[] files=dir.listFiles();

        String[] filenames=dir.list();
        for(String file:filenames){
            System.out.println(file);
        }


        for(File file:files){
            //判断是否是文件
            if(file.isFile()){
                System.out.println("是文件，删除");
                file.delete();
                return;
            }
            else{
                //是文件夹,判断是否是空文件夹
                if(file.length()==0){
                    System.out.println("是空文件夹，删除");
                    file.delete();
                    return;
                }
                else{
                    //是文件夹，但是不空
                    System.out.println("不是空文件夹，迭代查询");
                    deleteDirectory(file);
                }

            }
        }
    }
}
