package com.sjk.operator;

import java.util.Scanner;

public class operatorDemo10 {
    public static void main(String[] args) {
        /*
        练习1:键入一个4位整数，判断它是否是回文数

        练习2:寻找7的有缘数，定义一个2位整数，只要该数字包含7或者7的倍数，它就是7的有缘数
         */

        Scanner sc = new Scanner(System.in);
        //练习1：
        System.out.println("请输入一个4位数字：");
        int num = sc.nextInt();
        if (num <= 1000 || num >= 9999) { //判断是否是4位数
            System.out.println("您输入的数字不是一个四位数！");
            return;
        }
            int ge = num % 10;
            int shi = num / 10 % 10;
            int bai = num / 100 % 10;
            int qian = num / 1000;
            if (ge == qian && shi == bai) {
                System.out.println(num + "是回文数");
            } else {
                System.out.println(num + "不是回文数");
            }

        //练习2：
        System.out.println("请输入一个2位数：");
        int num2 = sc.nextInt();
        if (num2 <= 9 || num2 >= 99) { //判断是否是2位数
            System.out.println("您输入的数字不是一个2位数！");
            return;
        }
        int ge2 = num2 % 10;
        int shi2 = num2 / 10;
        if (ge2 == 7 || shi2 == 7 || num2 % 7 == 0){
            System.out.println(num2 + "是7的有缘数");
        }   else {
            System.out.println(num2 + "不是7的有缘数");
        }

    }
}
