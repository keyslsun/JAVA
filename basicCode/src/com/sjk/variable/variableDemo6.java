package com.sjk.variable;

//确定scanner的位置
import java.util.Scanner;

public class variableDemo6 {

    public static void main(String[] args) {
        //创建Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个整数：");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);
    }
}
