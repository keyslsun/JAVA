package com.sjk.operator;

import java.util.Scanner;

public class operatorDemo2 {
    public static void main(String[] args) {
        /*
        需求：键盘录入一个三位数，将其拆分成个位、十位、百位，并分别打印出来
         */
        Scanner sc = new Scanner(System.in);

        //1.输入一个三位数的整数
        System.out.println("请输入一个三位数的整数：");
        int num = sc.nextInt();

        //2.拆分
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        System.out.println("个位："+ge);
        System.out.println("十位："+shi);
        System.out.println("百位："+bai);
    }
}
