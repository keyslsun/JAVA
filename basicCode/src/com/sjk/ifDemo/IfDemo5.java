package com.sjk.ifDemo;

import java.util.Scanner;

public class IfDemo5 {
    public static void main(String[] args) {
        /*
        练习：键盘输入一个整数n
        若n是奇数，则f(n)=3n+1
        若n是偶数，则f(n)=n/2
         */

        Scanner sc = new Scanner(System.in);
        //1.定义n
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        int n = num % 2;
        //2.判断
        if(n == 0){ //判断偶数
            int f = num / 2;
            System.out.println(f);
        } else { //判断奇数
            int f = 3 * num + 1;
            System.out.println(f);
        }
    }
}
