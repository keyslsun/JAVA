package com.sjk.operator;

import java.util.Scanner;

public class operatorDemo8 {
    public static void main(String[] args) {
        /*
        练习1：键入你和你好朋友的身高，比一比谁更高

        练习2：键入一个3位数，判断是否可以被3整除
         */

        //1.练习1：
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的身高：");
        int a = sc.nextInt();
        System.out.println("请输入你的好朋友的身高：");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(("你更高"));
        }   else {
            System.out.println("他更高");
        }

        //2.练习2：
        System.out.println("请输入一个3位数：");
        int num = sc.nextInt();
        if (num % 3 == 0) {
            System.out.println("能被3整除");
        } else {
            System.out.println("不能被3整除");
        }
    }
}
