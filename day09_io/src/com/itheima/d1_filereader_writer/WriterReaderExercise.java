package com.itheima.d1_filereader_writer;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class WriterReaderExercise {
    public static void main(String[] args) {
        //目标：练习
        //拷贝出师表到出师表copy.txt,并且恢复顺序

        ArrayList<String> data=new ArrayList<>();

        try(
        Reader r=new FileReader("出师表.txt");
        Writer w=new FileWriter("出师表copy.txt");
        BufferedWriter bw=new BufferedWriter(w);
        BufferedReader br=new BufferedReader(r);

        ){
            String line;
            while((line=br.readLine())!=null){
                data.add(line);
                //写入换行符
            }

            //对data中的每一段按照段首序号进行排序
            Collections.sort(data);
            System.out.println(data);

            //5.调用list集合的内容，依次写入每一段到文件中去
            for(String s:data){
                bw.write(s);
                bw.newLine();
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }




    }
}
