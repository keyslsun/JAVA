package com.sjk.Break;

import java.util.Scanner;

public class breakDemo1 {
    public static void main(String[] args){
        /*
        需求：键盘输入一个数，判断是否是质数

        什么是质数：
        小于2的不是质数
        2是质数
        偶数不是质数

         */
        //1.定义变量
        Scanner sc = new Scanner(System.in);
        int number = 0;


        //使用循环
        while (true){
            System.out.println("请输入一个大于2的整数:");
            number = sc.nextInt();
            if (number >= 2){
                break;
            } else {
              System.out.println("请重新输入.");
            }
        }

        //2.判断number记录的数据是否是质数
        int count = 0;
        for (int i = 2; i <= number - 1; i++){
            if (number % i == 0){
                count++;
                break;
            }
        }

        //3.判断count是否是质数
        if (count == 0){
            System.out.println("是质数");
        } else {
            System.out.println("不是质数");
        }


    }
}
