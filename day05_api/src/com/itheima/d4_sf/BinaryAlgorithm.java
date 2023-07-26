package com.itheima.d4_sf;

import java.util.Arrays;

public class BinaryAlgorithm {
    public static void main(String[] args) {
        //手写一遍二分查找
        int temp;
        int target=12;
        int[] b={1,9,8,5,2,6};
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
        int low,high;
        low=0;
        high=b.length-1;
        int mid=(low+high)/2;
        while(low<=high){
            if(b[mid]==target){
                System.out.println("找到了，是数组中第"+(mid+1)+"个数");
                break;
            }
            else if(b[mid]>target){
                high=mid-1;
                mid=(low+high)/2;
            }
            else if(b[mid]<target){
                low=mid+1;
                mid=(low+high)/2;
            }
        }
        if(low>high){
            System.out.println("没找到，该数字不在数组中");
        }
        System.out.println("mid="+mid+", low="+low+",high="+high);

    }
}
/*
1 9 8 5 2 6
0 1 2 3 4 5
low:0
high:5
mid:2
 */