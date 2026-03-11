package com.sjk.operator;

import java.util.Scanner;

public class operatorDemo9 {
    public static void main(String[] args) {
        /*
        练习1：键入一个整数，判断它是否在1到10之间

        练习2：键入一个整数，判断它是否不在1到10之间

         */

        Scanner sc = new Scanner(System.in);
        //练习1：
        System.out.println("请输入一个整数：");
        int a = sc.nextInt();
        boolean result1 = a >= 1 && a <= 10; //1 <= a <= 10
        System.out.println(result1);

        //练习2：
        System.out.println("请输入一个整数：");
        int b = sc.nextInt();
        boolean result2 = b < 1 || b > 10; //1 > b > 10
        System.out.println(result2);
    }
}
