package d2_file;

import java.io.File;
import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        //目标：检验Test中文件名修改是否成功
        File f=new File("C:\\Users\\邓dan\\Desktop\\公主照片");
        String[] names=f.list();
        System.out.println(Arrays.toString(names));


    }
}
