package com.sjk.array;

import java.util.Random;

public class arrayDemo7 {
    public static void main(String[] args){
        /*
        需求：获取10-100的随机数，要求随机数不能重复存储在数组中
         */

        //1.创建数组
        int[] arr = new int[10];

        //2.创建随机数对象
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            //3.生成随机数
            int number = r.nextInt(10,101);
            arr[i] = number; //4.将随机数保存在数组中

            //5.判断数组中是否有重复数据
            for (int j = 0; j < i; j++) {   //循环判断
                if (arr[i] == arr[j]) { //判断是否重复:若 arr[i] == arr[j] 则说明有重复数据,则将i--,重新生成随机数
                    i--;
                    break;  //跳出循环
                }
            }

        }

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
