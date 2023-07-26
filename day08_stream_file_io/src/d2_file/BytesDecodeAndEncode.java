package d2_file;

import java.util.Arrays;

public class BytesDecodeAndEncode {
    public static void main(String[] args) {
        //目标：学会使用程序完成字符的编码和解码
        //1.编码：把字符串编码成字节形式
        String s1="abc我爱王一博bbb";
        byte[] bytes1=s1.getBytes();
        System.out.println(Arrays.toString(bytes1));


        //2.解码,默认编码是utf-8
        String news=new String(bytes1);
        System.out.println(news);
    }
}
