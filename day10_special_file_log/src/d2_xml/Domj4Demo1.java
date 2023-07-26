package d2_xml;

import com.sun.org.apache.xerces.internal.dom.ElementNSImpl;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.security.DomainCombiner;
import java.util.List;

public class Domj4Demo1 {
    public static void main(String[] args) throws Exception {
        //目标：解析XML文件
        //1.创建SAXReader解析器对象，代表整个domj4框架
        SAXReader saxReader=new SAXReader();

        //2.把XML文件读成Document文档对象
//        Document document=
//                saxReader.read("D:\\code\\huangpupro01\\" +
//                        "day10_special_file_log\\src\\d2_xml\\demo1_hello_world.xml");
        //上面的方法不符合解耦合的原则，所以推荐使用下面的方法
        InputStream is= Domj4Demo1.class.getResourceAsStream("demo1_hello_world.xml");
        Document document=saxReader.read(is);


        //3.从文档对象中解析XML
        Element root=document.getRootElement();
        System.out.println(root.getName());

        //4.解析全部一级子元素
        List<Element> elements=root.elements("contact");
        System.out.println(elements.size());
        for(Element e:elements){
            System.out.println(e.getName());
        }

        Element oneContact=root.element("contact");     //默认提取第一个子元素
        System.out.println(oneContact.elementText("gender"));

        //5.提取属性
        Attribute idAttr=oneContact.attribute("id");
        System.out.println(idAttr.getName());
        System.out.println(idAttr.getValue());
        System.out.println(oneContact.attributeValue("id"));

        //提取文本值
        System.out.println(oneContact.elementText("name"));     //提取子元素文本值
        System.out.println(oneContact.elementTextTrim("name"));   //去掉前后空格
        System.out.println(oneContact.elementText("email"));    //提取子元素文本值

        //提取文本值2：先拿到元素对象，再直接取其文本
        Element emailEle=oneContact.element("email");
        System.out.println(emailEle.getText());
        System.out.println(emailEle.getTextTrim());



    }
}
