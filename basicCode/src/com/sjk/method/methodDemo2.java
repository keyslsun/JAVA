package com.sjk.method;

import java.util.Scanner;

public class methodDemo2 {
    public static void main(String[] args){
        /*
        需求：写一个方法，用于鉴别数字是否存在于数组中
         */

        //1.创建数组
        int[] arr = {10,20,30,40,50};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        int number = sc.nextInt();//录入数字

        //3.调用方法

        boolean result = contains(arr,number);//调用方法

        System.out.println(result);

    }

    //2.定义方法
    public static boolean contains(int[] arr,int number){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == number){
                return true;
            }
        }
        return false;
    }
}
