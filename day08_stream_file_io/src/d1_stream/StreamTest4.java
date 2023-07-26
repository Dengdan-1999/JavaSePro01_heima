package d1_stream;

import java.util.ArrayList;
import java.util.List;

public class StreamTest4 {
    public static void main(String[] args) {
        //目标：Stream流的常见终结方法
        List<Movie> movies=new ArrayList<>();
        movies.add(new Movie("摔跤吧，爸爸1","阿米尔汗1",9.6));
        movies.add(new Movie("摔跤吧，爸爸1","阿米尔汗1",9.6));
        movies.add(new Movie("摔跤吧，爸爸3","阿米尔汗3",9.2));
        movies.add(new Movie("摔跤吧，爸爸4","阿米尔汗4",9.5));

        //1.forEach
        movies.stream().filter(m->m.getScore()>=9.5).forEach(System.out::println);

        //2.count
        System.out.println(movies.stream().filter(m->m.getScore()<9.5).count());

        //3.取最大值
        Movie mMax=movies.stream().max((m1,m2)->Double.compare(m1.getScore(),m2.getScore())).get();
        System.out.println(mMax);
        //4.取最小值
        Movie mMin=movies.stream().min((m1,m2)->Double.compare(m1.getScore(),m2.getScore())).get();
        System.out.println(mMin);

    }
}
