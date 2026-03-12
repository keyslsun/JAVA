package com.sjk.loopWhile;

public class whileDemo2 {
    public static void main(String[] args) {
        /*
        需求：在银行存储了10w，复利是1.7
        请问多少年可以存到200000？
         */

        //1.定义变量
        double money = 100000;
        double yearRate = 1.017;    //年利率
        double expectMoney = 200000;    //期望金额
        int year = 0; //年数

        //2.使用while循环
        while(money < expectMoney){ //循环条件
            money = money * yearRate;
            year++;
        }

        //3.输出结果
        System.out.println(year + "年后，金额变成200000");
    }
}
