package d2_file;
/*
案例
猴子吃桃问题
猴子第一天摘下若干桃子，当即吃了一半，觉得好不过瘾，于是又多吃了一个
第二天又吃了前天剩余桃子数量的一半，觉得好不过瘾，于是又多吃了一个
以后每天都是吃前天剩余桃子数量的一半，觉得好不过瘾，又多吃了一个
等到第10天的时候发现桃子只有1个了。
需求：请问猴子第一天摘了多少个桃子？
规律：f(n)=f(n-1)-f(n-1)/2-1;
f(10)=1;
f(n)+1=f(n-1)/2;


 */
public class RecursionTest3 {
    public static void main(String[] args) {
        //目标：练习一个简单的递归问题：猴子吃桃问题
        int n=10;
        int sum=1;
        while(n>1){
            n--;
            sum=(sum+1)*2;
            System.out.println("第"+n+"天早上有桃子："+sum+"个");
        }
        int sum2=f(1);
        System.out.println("标准答案，第1天早上有桃子："+sum2);

    }

    public static int f(int n){
        if(n==10){
            return 1;
        }
        return 2*f(n+1)+2;
    }

}
