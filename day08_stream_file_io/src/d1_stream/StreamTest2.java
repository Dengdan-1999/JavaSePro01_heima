package d1_stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamTest2 {
    public static void main(String[] args) {
        //目标：获取Stream流
        //1.获取集合的Stream流：default Stream<E> stream()
        Collection<String> list=new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张三丰");
        Stream<String> stream11=list.stream();

        //2.获取Map集合的Stream流
        Map<String,Integer> map=new HashMap<>();
        //a.获取键流
        Stream<String> keys=map.keySet().stream();
        //b.获取值流
        Stream<Integer> values=map.values().stream();
        //c.获取键值对流
        Stream<Map.Entry<String,Integer>> entryStream=map.entrySet().stream();

        //3.获取数组的Stream流
        String[] names={"赵敏","王菲","小昭"};
        Stream<String> stream1=Arrays.stream(names);
        Stream<String> stream2=Stream.of(names);

    }
}
