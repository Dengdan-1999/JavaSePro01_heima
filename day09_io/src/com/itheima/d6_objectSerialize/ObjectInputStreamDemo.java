package com.itheima.d6_objectSerialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.ObjectInputStream;

//对象的序列化：指的是将Java对象存入到文件中去
//对象反序列化：指的是将文件中的Java对象读入到内存中来
public class ObjectInputStreamDemo {
    public static void main(String[] args) throws Exception {
        //目标：对象反序列化，使用对象字节输入流管道把文件中的Java对象又读入到内存中去
        //1.创建对象字节输入流管道
        InputStream is=new FileInputStream("D:\\code\\huangpupro01\\haha.txt");
        //2.读取对象进来(对象反序列化)
        ObjectInputStream ois=new ObjectInputStream(is);
        //
        Object o=ois.readObject();
        Student s=(Student)o;
        System.out.println(o);
        System.out.println(s);

        //读取多个序列化对象,拿到的是那个ArrayList集合students
        Object o2=ois.readObject();
        System.out.println(o2);

        ois.close();
    }
}
