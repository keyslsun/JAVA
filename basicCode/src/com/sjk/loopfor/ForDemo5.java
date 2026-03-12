package com.sjk.loopfor;

import java.util.Scanner;

public class ForDemo5 {
    public static void main(String[] args) {
        /*
        需求：键盘录入两个整数，表示范围
        统计这个范围中
        能被3整除的又能被5整除的数有多少个
         */

        //1.键盘录入两个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个整数：");
        int num1 = sc.nextInt();   //输入开始数
        int num2 = sc.nextInt();     //输入结束数

        //2.求最大和最小
        int max = num1 > num2 ? num1 : num2; //获取最大数
        int min = num1 < num2 ? num1 : num2; //获取最小数


        //3.定义统计的变量
        int count = 0;

        //4.利用for循环
        for (int i = min; i <= max; i++){ //遍历范围
            if (i % 3 == 0 && i % 5 == 0){  //判断i是否满足条件
                count++;
            }
        }

        //5.输出结果
        System.out.println("范围内共有" + count + "个数满足要求");


    }
}
