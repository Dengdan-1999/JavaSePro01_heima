package d2_file;

public class RecursionTest2 {
    public static void main(String[] args) {
        //目标：练习一个简单的递归问题：计算n的阶乘
        System.out.println(multi(5));
    }

    public static int multi(int n){
        if(n==1){
            return 1;
        }
        else{
            return multi(n-1)*n;
        }
    }
}
