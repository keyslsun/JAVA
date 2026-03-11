package com.sjk.ifDemo;

import java.util.Scanner;

public class IfDemo4 {
    public static void main(String[] args) {
        /*
        需求：小明每次订外卖都会在多家平台对比，看谁的优惠力度更大
        已知条件：
        1.京东：全场九折
        2.美团：满30减10

        问题1：小明买了一顿50的烧烤，哪家更便宜？
        问题2：如果价格不确定，由键盘录入呢？
         */

        //问题1：
        //1.定义变量
        double pay1 = 50;

        //2.计算京东的优惠价格
        double jdPay1 = pay1 * 0.9;
        System.out.println("京东的优惠价格为："+jdPay1);

        //3.计算美团优惠价格
        double mtPay1 = 0;
        if (pay1 >= 30) {
            mtPay1 = pay1 - 10;
        }  else {
            mtPay1 = pay1;
        }
        System.out.println("美团优惠价格为："+mtPay1);

        //4.判断
        if(jdPay1 < mtPay1){ //判断jdPay1是否小于mtPay1
            System.out.println("京东的优惠价格更便宜，为："+jdPay1);
        }   else {  //判断jdPay1是否大于mtPay1
            System.out.println("美团优惠价格更便宜，为："+mtPay1);
        }

        //问题2：
        //1.定义变量
        Scanner sc = new Scanner(System.in);    //创建Scanner
        System.out.println("请输入价格：");   //提示用户输入价格
        double pay2 = sc.nextDouble();  //接收价格

        //2.计算京东的优惠价格
        double jdPay2 = pay2 * 0.9;
        System.out.println("京东的优惠价格为："+jdPay2);

        //3.计算美团优惠价格
        double mtPay2 = 0;
        if (pay2 >= 30) {
            mtPay2 = pay2 - 10;
        }  else {
            mtPay2 = pay2;
        }
        System.out.println("美团优惠价格为："+mtPay2);

        //4.判断
        if(jdPay2 < mtPay2){
            System.out.println("京东的优惠价格更便宜，为："+jdPay2);
        } else if (jdPay2 == mtPay2) {  //判断jdPay2是否等于mtPay2
            System.out.println("京东和美团优惠价格一样");
        } else {
            System.out.println("美团优惠价格更便宜，为："+mtPay2);
        }
    }
}
