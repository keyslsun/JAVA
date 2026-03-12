package com.sjk.array;

import java.util.Scanner;

public class arrayDemo4 {
    public static void main(String[] args) {
        /*
        需求：键盘录入一个整数，查找这个数在数组中是否存在
        若存在只要返回第一次的索引即可
         */

        //1. 定义数组
        int[] arr = {10, 20, 30, 40, 10};

        //2. 键盘录入数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = sc.nextInt();

        //3. 遍历数组
        for (int i = 0; i < arr.length; i++) {  //设置判断条件为i<arr.length
            if (number == arr[i]) { //判断条件
                System.out.println("该数在数组中第一次出现的索引为：" + i);
                return;//清空栈
            }
        }

        //4. 若不存在，输出结果
        System.out.println("该数在数组中不存在");

    }
}
