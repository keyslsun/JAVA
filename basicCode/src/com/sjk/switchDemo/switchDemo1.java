package com.sjk.switchDemo;

import java.util.Scanner;

public class switchDemo1 {
    public static void main(String[] args) {
        /*
        需求：每周执行不同的活动
        1.周一：学习java
        2.周二：跑步
        3.周三：看电影
        4.周四：看书
        5.周五：玩游戏
        6.周六：约会
        7.周日：看电影
        输入数字，输出对应的活动
         */

        //1.定义变量
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        int week = sc.nextInt();

        //2.判断
        switch (week){ //利用switch判断
            case 1: //1对应周一
                System.out.println("学习java");
                break;
            case 2:
                System.out.println("跑步");
                break;
            case 3:
                System.out.println("看电影");
                break;
            case 4:
                System.out.println("看书");
                break;
            case 5:
                System.out.println("玩游戏");
                break;
            case 6:
                System.out.println("约会");
                break;
            case 7:
                System.out.println("看电影");
                break;
            default: //其他情况
                System.out.println("不存在的星期");
        }
    }
}
