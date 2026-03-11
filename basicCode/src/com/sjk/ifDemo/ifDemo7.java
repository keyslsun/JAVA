package com.sjk.ifDemo;

import java.util.Scanner;

public class ifDemo7 {
    public static void main(String[] args) {
        /*
        需求：计算电费
        0~100 度，计费0.5/度
        101~200 度，计费0.8/度
        超过200 度，计费1.5/度
         */

        //1.键盘录入使用度数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入使用度数：");
        int degree = sc.nextInt();

        //2.定义不同的阈值
        int threshold1 = 100;   //阈值1
        int threshold2 = 200;   //阈值2

        //3.判断
        double cost = 0;    //电费
        if (degree > 0){
            if (degree <= threshold1) { //判断是否在阈值1内
                cost = degree * 0.5;
                System.out.println("电费为：" + cost);
            } else if (degree <= threshold2) {  //判断是否在阈值2内
                cost = threshold1 * 0.5 + (degree - threshold1) * 0.8;
                System.out.println("电费为：" + cost);
            } else {    //判断是否在阈值3内
                cost = threshold1 * 0.5 + (threshold2 - threshold1) * 0.8 + (degree - threshold2) * 1.5;
                System.out.println("电费为：" + cost);
            }
        }   else {
            System.out.println("请输入正确的使用度数！");
        }
    }
}
