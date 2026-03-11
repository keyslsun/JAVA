package com.sjk.ifDemo;

import java.util.Scanner;

public class IfDemo6 {
    public static void main(String[] args) {
        /*
        需求：很多APP有不同价格的优惠卷
        假设，现在有以下优惠卷
        购物满20减2元
        购物满50减5元
        全场满100减15元
        全场满200元减35元

        会员卡全场8.8折

        练习：会员卡和忧患卷不能同时使用，最优惠的价格是多少？
         */

        //1.定义变量
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入购物金额：");
        double money = sc.nextDouble();
        double scount = 0;
        double ScountMoney = 0;

        //2.判断并计算使用优惠卷
        if (money > 0){ //购物金额大于0
            if (money > 20){    //购物金额大于20
                if (money < 50) {  //购物金额小于50
                    scount = 2;
                    ScountMoney = money - 2;
                    System.out.println("使用满20元优惠券，优惠后价格为：" + ScountMoney);
                    System.out.println("优惠金额：" + scount);
                } else if (money < 100) {
                    scount = 5;
                    ScountMoney = money - 5;
                    System.out.println("使用满50元优惠券，优惠后价格为：" + ScountMoney);
                    System.out.println("优惠金额：" + scount);
                } else if (money < 200) {
                    scount = 10;
                    ScountMoney = money - 10;
                    System.out.println("使用满100元优惠券，优惠后价格为：" + ScountMoney);
                    System.out.println("优惠金额：" + scount);
                } else if (money >= 200) {
                    scount = 35;
                    ScountMoney = money - 35;
                    System.out.println("使用满200元优惠券，优惠后价格为：" + ScountMoney);
                    System.out.println("优惠金额：" + scount);
                }
            } else {    //购物金额小于20
                System.out.println("无可用优惠券");
                System.out.println("原价：" + money);
            }
        }   else {  //购物金额小于0
            System.out.println("输入的购物金额有误");
        }

        //3.判断会员卡
            double VipMoney = money * 0.88;
            double VipScount = money - VipMoney;
            System.out.println("使用会员卡后，优惠金额：" + VipScount);

        //4.判断最优惠价格
        if (ScountMoney > VipMoney){ //判断会员卡优惠价格是否小于优惠券优惠价格
            System.out.println("会员卡优惠价格更优惠，为：" + VipMoney);
        }   else {
            System.out.println("优惠券优惠价格更优惠，为：" + ScountMoney);
        }
    }
}
