package d1_Properties;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo1 {
    public static void main(String[] args) throws Exception {
        //目标：读取属性文件中的键值对数据
        //1.创建属性对象
        Properties properties=new Properties();

        //2.加载属性文件中的数据
        InputStream is=new FileInputStream("" +
                "D:\\code\\huangpupro01\\day10_special_file_log\\src\\d1\\属性文件.properties");
        properties.load(is);

        //3.根据键取值
        String value=properties.getProperty("zwj");
        System.out.println(value);

        //4.拿到全部键的集合
        Set set=properties.stringPropertyNames();
        System.out.println(set.toString());


    }
}
