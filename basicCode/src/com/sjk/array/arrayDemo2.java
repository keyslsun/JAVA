package com.sjk.array;

public class arrayDemo2 {
    /*
    需求：数组的遍历
     */

    public static void main(String[] args) {
        int [] arr= {10, 20, 30, 40, 50};   // 定义数组

        System.out.println(arr.length); // 输出数组长度

        // 通过循环遍历数组
        for (int i = 0; i < arr.length; i++) {  //设置判断条件为i<arr.length
            System.out.println(arr[i]);
        }
    }
}
