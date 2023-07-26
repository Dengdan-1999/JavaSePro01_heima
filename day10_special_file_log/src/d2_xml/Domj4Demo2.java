package d2_xml;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

//把数据写到xml文件中去，不建议使用dom4j做，
//推荐直接把程序里的数据拼接成XML格式，然后用IO流写出去！
public class Domj4Demo2 {
    public static void main(String[] args) throws Exception {
        //1.生产XML数据到XML文件
        StringBuilder sb=new StringBuilder();
        sb.append("<?xml version='1.0' encoding=\"UTF-8\"?>\r\n");
        sb.append("<user>\r\n");
        sb.append("\t<name>").append("张麻子").append("</name>\r\n");
        sb.append("\t<age>").append("男").append("</sex>\r\n");
        sb.append("</user>\r\n");



        //2.写出去
        PrintWriter pw=new PrintWriter("D:\\code\\huangpupro01\\day10_special_file_log\\src\\d2_xml\\demo2_user.xml");
        pw.print(sb.toString());
        pw.close();
    }
}
