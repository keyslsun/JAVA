package com.sjk.ifDemo;

import java.util.Scanner;

public class IfDemo3 {
    public static void main(String[] args){
        /*
        需求：定义一个浮点数表示成绩
        如果成绩>=60，则打印通过，若成绩<60，则打印不通过
         */

        //1.定义变量
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩：");
        double score = sc.nextDouble();

        //2.判断
        if (score <= 100 && score >= 0){ //判断分数的合法性
            if (score >= 60){
                System.out.println("通过");
            } else {
                System.out.println("不通过");
        }
        } else {    //输入的分数不合法
            System.out.println("输入的分数有误");
        }
    }
}
