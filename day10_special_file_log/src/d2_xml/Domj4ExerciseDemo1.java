package d2_xml;
//不是说难，但是过程比较复杂，

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* 案例
XML解析案例
需求:利用Dom4J框架，将contacts.xml文件中的联系人数据，解析出来,封装成List集合，并遍历输出。
 */
public class Domj4ExerciseDemo1 {
    public static void main(String[] args) throws Exception {
        //目标：练习题
        //1. 创建SAXReader解析器对象，代表整个domj4框架
        SAXReader saxReader=new SAXReader();

        //2.把XML文件读成Document文件对象
        InputStream is=Domj4Demo1.class.getResourceAsStream("demo1_hello_world.xml");
        Document document=saxReader.read(is);

        //3.从文档对象中解析xml
        Element root=document.getRootElement();
        System.out.println(root.getName());

        //4.提取全部一级子元素
        List<Element> elements=root.elements("contact");
        System.out.println(elements.size());

        int n=elements.size();

        List<People> peoplelist=new ArrayList<>();


        for(Element e:elements){
            Element name=e.element("name");
            Element gender=e.element("gender");
            Element email=e.element("email");
            People p=new People(name.getText(),gender.getText(),email.getText());
            peoplelist.add(p);
            System.out.println(e);
        }

        for(People p:peoplelist){
            System.out.println(p.toString());
        }
        System.out.println("程序运行结束！");

//        String[] names=new String[element.size]

        //5.提取属性
        //6.提取文本值
    }
}

class People{
    public String name;
    public String gender;
    public String email;
    public People(String name,String gender,String email){
        this.name=name;
        this.gender=gender;
        this.email=email;
    }

    @Override
    public String toString(){
        return this.name+", "+this.gender+", "+this.email;
    }

}
