package com.itheima.d4_sf;

import java.util.Arrays;

public class selectAlgorithm {
    public static void main(String[] args) {
        //自己手写一遍选择查找
        int temp;
        int[] a={1,9,8,5,2,6};
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}

/*
1,2,3,4,5,6    :6
0 1 2 3 4 5

 */