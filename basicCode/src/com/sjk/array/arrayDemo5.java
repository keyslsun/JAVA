package com.sjk.array;

public class arrayDemo5 {
    public static void main(String[] args) {
        /*
        需求：查找数组中的最大值并打印

        细节：max的值必须初始化成数组的值
         */

        //1. 定义数组
        int[] arr = {100, 20, 300, 40, 50};

        //2. 定义变量
        int max = arr[0];

        //3. 循环遍历进行比较
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];   // 将最大值缓存
            }
        }

        //4. 输出结果
        System.out.println("最大值为：" + max);

        //5.输出数组最大值的索引
        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {    // 判断最大值
                System.out.println("最大值索引为：" + i);
            }
        }


    }
}
