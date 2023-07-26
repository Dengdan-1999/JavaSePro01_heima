package d1_stringbuilder;

public class Test2 {
    public static void main(String[] args) {
//        String s="";
//        for(int i=0;i<100000;i++){
//            s=s+"abc";
//
//        }
//        System.out.println(s);

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<100000;i++){
            sb.append("abc");
        }
        System.out.println(sb);
    }
}
