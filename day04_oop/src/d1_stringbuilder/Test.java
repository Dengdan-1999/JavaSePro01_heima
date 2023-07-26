package d1_stringbuilder;

public class Test {
    public static void main(String[] args) {
        //目标：掌握StringBuilder的使用
        //1.创建StringBuilder的对象
        StringBuilder sb=new StringBuilder();
        System.out.println(sb);

        //2.对字符串进行操作
        sb.append("java");
        sb.append(23);
        sb.append("html").append("前端").append("mySql");
        System.out.println(sb);

        //3 反转
        sb.reverse();
        System.out.println(sb);

        //4.长度
        System.out.println(sb.length());

        //5.转换成字符串
        //StringBuilder是拼接字符串的手段
        //而String才是目的
        String rs=sb.toString();
        System.out.println(rs);
    }
}
