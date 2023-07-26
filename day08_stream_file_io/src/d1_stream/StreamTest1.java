package d1_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest1 {
    public static void main(String[] args) {
        //目标：体验Stream流的使用
        List<String> list=new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("小昭");
        list.add("殷离");

        System.out.println(list);

        //1.拿出姓张的放到新集合中去
        List<String> newList=new ArrayList<>();
        for(String name:list){
            if(name.startsWith("张")){
                newList.add(name);
            }

        }
        System.out.println(newList);

        //2.stream流的方法完成同样功能
        List<String> newList2=list.stream().filter(
                s->s.startsWith("张")).collect(Collectors.toList());
        System.out.println(newList2);
    }
}
