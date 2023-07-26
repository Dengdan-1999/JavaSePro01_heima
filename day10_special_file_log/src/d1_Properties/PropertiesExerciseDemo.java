package d1_Properties;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class PropertiesExerciseDemo {
    public static void main(String[] args) throws Exception {
        //D:\code\huangpupro01\用于测试的文本文档\peoples.txt
        Reader is=new
                FileReader("D:\\code\\huangpupro01\\用于测试的文本文档\\peoples.txt");

        //1.读取属性文件中的全部键值对数据
        Properties properties=new Properties();
        properties.load(is);
        Set set=properties.stringPropertyNames();
        System.out.println(set);
//        properties.setProperty("李芳","72");
        Object value=properties.get("李芳");
        System.out.println(value);

        //2.判断是否包含李芳，包含就改成18岁
        if(properties.containsKey("李芳")){
            properties.setProperty("李芳","12");
        }

        //3.把属性文件对象存入到文件中去
        Writer writer=new FileWriter("D:\\code\\huangpupro01\\用于测试的文本文档\\peoples.txt");
        properties.store(writer,"为什么还要这一步？");


    }
}
