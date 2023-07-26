package d1_Properties;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Properties;

//目标：掌握把键值对数据写道属性文件中去
public class PropertiesDemo2 {
    public static void main(String[] args) throws Exception {
        //1.创建Properties对象
        Properties properties=new Properties();

        //2.把键值对数据存入到属性文件中去
        properties.setProperty("张无忌","赵敏");
        properties.setProperty("殷素素","张翠山");
        properties.setProperty("金花婆婆","银叶先生");

        //3.把键值对数据存入到属性文件中去
        Writer writer=new FileWriter("test.properties");
        properties.store(writer,"测试一下能否保存成功！");

    }
}
