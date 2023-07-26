package d1_stream;

import java.util.*;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest5 {
    public static void main(String[] args) {
        //目标：收集stream流，把流中的数据恢复到集合或者数组中去
        List<String> list=new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("小昭");
        list.add("殷离");
        list.add("赵敏");
        list.add("张无忌");

        //收集到list集合
        Stream<String> zhangStream=list.stream()
                .filter(s->s.startsWith("张")&& s.length()==3);
        List<String> names=zhangStream.collect(Collectors.toList());
        System.out.println(names);
        names.add("知画");
        System.out.println(names);

        //收集到Set集合
        Stream<String> zhangStream2=list.stream().filter(s->s.startsWith("周"));
        Set<String> names2=zhangStream2.collect(Collectors.toSet());
        System.out.println(names2);
        names2.add("周周");
        names2.add("周周2");
        System.out.println(names2);

        //收集到数组
        Stream<String> zhangStream3=list.stream().filter(s->s.startsWith("小"));
        Object[] array=zhangStream3.toArray();
        System.out.println(array);
        System.out.println(Arrays.toString(array));

        //一定要转字符数组的方法：
        Stream<String> zhangStream4=list.stream().filter(s->s.startsWith("周"));
        String[] array2=zhangStream4.toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(array2));

        //简化1.0版本
        Stream<String> zhangStream5=list.stream().filter(s->s.startsWith("周"));
        String[] array3=zhangStream5.toArray(len->new String[len]);

        //简化2.0版本 构造器引用
        Stream<String> zhangStream6=list.stream().filter(s->s.startsWith("周"));
        String[] array4=zhangStream6.toArray(String[]::new);


        //拓展，利用stream转map
        List<Movie> movies=new ArrayList<>();
        movies.add(new Movie("m1","a1",8.9));
        movies.add(new Movie("m2","a2",8.5));
        movies.add(new Movie("m3","a3",8.8));
        movies.add(new Movie("m4","a4",9.9));
        Map<String,Double> result=movies.stream().filter(m->m.getScore()>8.5)
                .distinct().collect(Collectors.toMap(m->m.getName(),m->m.getScore()));
        System.out.println(result);


    }
}
