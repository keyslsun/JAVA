package com.sjk.array;

import java.util.Scanner;

public class arrayDemo3 {
    public static void main(String[] args) {
        /*
        需求：通过键盘录入五个整数，存储进数组
         */

        //1. 定义数组
        int[] arr = new int[5];

        //2. 录入数据
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个数：");
            arr[i] = sc.nextInt();  //录入数据
        }

        //3. 遍历数组输出数据
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
