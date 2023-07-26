package d6_enum;

public class Test2 {
    public static void main(String[] args) {
        C c1=C.X;
        System.out.println(c1);
        c1.go();
        C c2=C.X;
        System.out.println(c1==c2);

    }
}
