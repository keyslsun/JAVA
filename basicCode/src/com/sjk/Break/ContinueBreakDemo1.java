package com.sjk.Break;

import java.util.Random;
import java.util.Scanner;

public class ContinueBreakDemo1 {
    public static void main(String[] args) {
        /*
        需求：随机生成1个1-100之间的整数，直到猜中为止，否则不会停止

        生成随机数的三种写法：
        1.Math.random() * 100 + 1; -----> 随机数范围：1-100
        2.int number = r.nextInt(n) ----> n为随机数范围，但是不包含n
        3.int number = r.nextInt(a,b);  -----> a为随机数范围，包含a，b为随机数范围，不包含b
         */

        //1.定义变量
        Random r = new Random(); //创建随机数对象
        int number = r.nextInt(1,101); //生成随机数: 1-100
        Scanner sc = new Scanner(System.in);
        int input = 0;  //定义输入的数字

//        System.out.println(number);

        //2.使用循环
        while (true){ //条件为真，无限循环
            System.out.println("请输入一个数字：");
            input = sc.nextInt();   //输入数字
            if (input == number) {
                System.out.println("恭喜你猜对了！");
                break;
            } else if (input > number) {
                System.out.println("你输入的数字太大了！");
            } else {
                System.out.println("你输入的数字太小了！");
            }
        }
    }
}
