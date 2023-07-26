package com.itheima.d4_sf;

import java.util.Arrays;

public class bubbleAlgorithm {
    public static void main(String[] args) {
        //自己手写一遍冒泡排序
        int temp;
        int[] a={1,9,8,5,2,6};
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));


    }
}

