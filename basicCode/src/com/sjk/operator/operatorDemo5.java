package com.sjk.operator;

public class operatorDemo5 {
    public static void main(String[] args) {
        /* 练习2：
        检查以下代码是否报错，若报错，请找出错误并修复。



        short a = 100;
        short b = 200;

        byte c = a + b;  //错误
        short + short = int (隐式转换)
        300（int）的二进制表示为：00000000 00000000 00000001 11110100
         */
        short a = 100;
        short b = 200;

        //方法1：强制转换
        byte c = (byte)(a + b); //会截断溢出的数据
        System.out.println(c);

        //方法2：
        int d = a + b;
        System.out.println(d);
    }
}
