package com.sjk.operator;

public class operatorDemo4 {
    public static void main(String[] args) {
       //练习1：
        byte a = 10;
        short b = 20;
        double c = 21.1;

        //说出下面代码在计算过程中的类型转换的情况：
        /*
            第一步：把a+b的结果转换成int
            结果：30（int）

            第二步：把30(int)+c的结果转换成double
            结果：51.1（double）
         */
        double d = a + b + c;
        System.out.println(d);

    }

}
