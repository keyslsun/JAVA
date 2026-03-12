package com.sjk.loopWhile;

import java.util.Scanner;

public class whileDemo4 {
    public static void main(String[] args) {
        /*
        需求：给定一个整数n，求它的数位之和。若n为负数，则n取绝对值。
         */

        //1. 定义变量
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = sc.nextInt();
        int sum = 0;

        //2. 判断条件
        if (n < 0) {    // 判断若为负数
            n = -n;     //3. n取绝对值
            while (n != 0) {    //4. 循环条件
                sum = sum + n % 10;     //5. 缓存各数位之和
                n /= 10;    //6. 取下一位数
            }
        }   else {
            while (n != 0) {    // 循环条件
                sum = sum + n % 10; // 各数位之和
                n /= 10;    // 取下一位数
            }
        }

        //7. 输出结果
        System.out.println("数位之和为：" + sum);
    }
}
