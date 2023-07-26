package d2_xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class Dom4jExerciseDemo1 {
    public static void main(String[] args) throws Exception {
        //目标：练习使用XML文件解析
        SAXReader saxReader=new SAXReader();
        Document document=saxReader.read("D:\\code\\huangpupro01" +
                "\\day10_special_file_log\\src\\d2_xml\\demo1_hello_world.xml");

        Element root=document.getRootElement();
        System.out.println(root.getName());
        System.out.println(root.getText());

        List<Element> elements=root.elements();

        for(Element element:elements){
            System.out.println("====================");
            System.out.println(element.getName());
            Attribute attribute=element.attribute("id");
            System.out.println(attribute.getName());
            System.out.println(attribute.getValue());
            System.out.println(element.elementText("name"));
            System.out.println(element.elementText("gender"));
            System.out.println(element.elementText("email"));
//            System.out.println(element.getText());
//            System.out.println(element.getStringValue());
        }


    }

}
