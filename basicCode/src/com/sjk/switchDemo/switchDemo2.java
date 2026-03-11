package com.sjk.switchDemo;

import java.util.Scanner;

public class switchDemo2 {
    public static void main(String[] args) {
        /*
        若switch中没有设置break，则执行完case中的代码，会继续执行下一个case中的代码，也就是所谓的穿透
        穿透的执行流程：会先执行匹配的语句，然后执行下一个case中的代码，持续穿透到没有语句
         */

        //1.定义变量
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        int week = sc.nextInt();

        //2.判断
        switch (week){ //利用switch判断
            case 1: //1对应周一
                System.out.println("学习java");
            case 2:
                System.out.println("跑步");
            case 3:
                System.out.println("看电影");
            case 4:
                System.out.println("看书");
            case 5:
                System.out.println("玩游戏");
            case 6:
                System.out.println("约会");
            case 7:
                System.out.println("看电影");
            default: //其他情况
                System.out.println("不存在的星期");
        }
    }
}
