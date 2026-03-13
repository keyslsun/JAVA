package com.sjk.test;

public class test1 {
    public static void main(String[] args) {
        /*
        需求：定义一个数组，删除数组中和val值相同的元素
         */

        //1.定义数组
        int[] arr = {20, 20, 30, 40, 50, 20, 30};
        int fast = 0;
        int slow = 0;
        int val = 20;

        //2.遍历数组
        while (fast < arr.length){
            if (arr[fast] != val){  // 判断fast指向的元素是否等于val
                arr[slow] = arr[fast];  // 将fast指向的元素赋给slow
                slow++; // slow后移
            }
            fast++; // fast后移
        }

        //3.输出数组
        for (int i = 0; i < slow; i++){ //遍历slow
            System.out.print(arr[i] + " ");
        }
    }
}
