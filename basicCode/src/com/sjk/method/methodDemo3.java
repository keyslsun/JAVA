package com.sjk.method;

public class methodDemo3 {
    public static void main(String[] args) {
        /*
        需求：定义一个方法遍历数组
        输出格式如下
        [10, 20, 30, 40, 50]

        细节：方法没有调用返回值，所以要用void

         */

        //1.创建数组
        int[] arr = {10, 20, 30, 40, 50};

        //3.调用方法
        printArray(arr);
    }

    //2.定义方法
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i <= arr.length - 1; i++){  //遍历数组
            if (i < arr.length - 1){    //若不是最后一个元素
                System.out.print(arr[i] + "," + " "); //输出元素+逗号
            } else {    //是最后一个元素
                System.out.print(arr[i]);   //仅输出元素
            }
        }
        System.out.print("]");
    }
}
