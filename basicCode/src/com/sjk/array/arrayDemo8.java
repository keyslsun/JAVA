package com.sjk.array;

public class arrayDemo8 {
    public static void main(String[] args) {
        /*
        需求：给定义一个递增数组,去除重复数据

        细节：使用快慢指针
        慢指针：存入的位置
        快指针：找不重复的数据
        相等：舍弃快指针位置的数据
        不相等：将快指针位置的数据存入慢指针位置

         */

        //1.创建数组
        int[] arr = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10};

        //2.创建慢指针
        int slow = 0;

        //3.创建快指针
        int fast = 1;

        //4.遍历数组
        while (fast < arr.length) {
            //5.判断
            if (arr[slow] == arr[fast]){    //相等

            } else {  //不相等
                slow++; //慢指针自增
                arr[slow] = arr[fast];  //赋值给慢指针位置
            }
            fast++; //快指针自增
        }
        //6.输出结果
        for (int i = 0; i <= slow; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
