package d1_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamTest3 {
    public static void main(String[] args) {
        //目标：掌握Stream流的常见方法
        List<String> list=new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","小昭","赵敏","殷离");

        //1.过滤方法
        list.stream().filter(s->s.startsWith("张")).filter(s->s.length()==3)
                .forEach(System.out::println);

        //2.准备一个集合，排序
        List<Movie> movies=new ArrayList<>();
        movies.add(new Movie("摔跤吧，爸爸1","阿米尔汗1",9.6));
        movies.add(new Movie("摔跤吧，爸爸1","阿米尔汗1",9.6));
        movies.add(new Movie("摔跤吧，爸爸3","阿米尔汗3",9.2));
        movies.add(new Movie("摔跤吧，爸爸4","阿米尔汗4",9.5));

        //集合中是对象时
        //方式1：对象类实现Comparable接口，指定比较规则
        //sorted方法就可以按照规则进行排序，否则报错！
        movies.stream().sorted().forEach(System.out::println);

        //3。limit取前几个
        System.out.println("====================================");
        movies.stream().sorted().limit(2).forEach(System.out::println);

        //4.跳过前几个skip
        System.out.println("====================================");
        movies.stream().sorted().skip(2).forEach(System.out::println);

        //5.distinct去重复
        System.out.println("====================================");
        //去重复：需要重写对象类的hashCdode和equals方法
        movies.stream().distinct().forEach(System.out::println);

        //6.map加工方法(映射)：把流上的数据加工成新数据
        System.out.println("------------------------------------");
        movies.stream().map(new Function<Movie, String>() {
            @Override
            public String apply(Movie movie){
                return movie.getName()+", 主演:"+movie.getActor();
            }
        }).forEach(System.out::println);

        //简化后
        System.out.println("------------------------------------");
        movies.stream().map(m->m.getName()+"-主演:"+m.getActor())
                .forEach(System.out::println);

        //7.合并流
        //把两个流连接起来f
        Stream<String> s1= Stream.of("张三","李四","王五");
        Stream<String> s2= Stream.of("张三王八","李四蛤蟆","王五麻子");

        Stream<String> allStream=Stream.concat(s1,s2);
        System.out.println(allStream.count());
//        allStream.forEach(System.out::println);


    }
}
