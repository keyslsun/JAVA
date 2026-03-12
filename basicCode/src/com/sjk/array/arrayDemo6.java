package com.sjk.array;

import java.util.Random;

public class arrayDemo6 {
    public static void main(String[] args) {
        /*
        需求：打乱数组中的数据
         */

        //1. 定义数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }

        System.out.println();   // 换行

        Random r = new Random();    //创建随机数对象

        //2.遍历数组
        for (int i = 0; i < arr.length; i++) {
            int RandomIndex = r.nextInt(arr.length);//获取随机索引值

            //3. 获取随机索引值
            int temp = arr[i];  //缓存当前元素(数据)
            arr[i] = arr[RandomIndex];  //赋值给随机索引值
            arr[RandomIndex] = temp;    //赋值给当前索引值

            //4. 输出结果
            System.out.print(arr[i] + " ");
        }

    }
}
