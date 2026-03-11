package com.sjk.operator;

import java.util.Scanner;

public class operatorDemo11 {
    public static void main(String[] args) {
        /*
        需求：键盘录入两个数，比较它们的大小，并打印出较大值
         */

        Scanner sc = new Scanner(System.in);
        //1.录入两个数
        System.out.println("请输入第一个数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数：");
        int b = sc.nextInt();
        //2.比较两个数大小
        //使用三目表达式
        int max = a > b ? a : b; //第一步若位true，则返回a，否则返回b
        System.out.println("最大的是" + max);
    }
}
