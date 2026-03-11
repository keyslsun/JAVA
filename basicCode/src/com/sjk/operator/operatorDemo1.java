package com.sjk.operator;

public class operatorDemo1 {
    public static void main(String[] args) {
        //1.整数计算
        //细节：整数相除结果还是整数
        int a = 10;
        int b = 20;
        System.out.println(a+b); //30
        System.out.println(a-b); //-10
        System.out.println(a*b); //200
        System.out.println(a/b); //0
        System.out.println(a%b); //10

        System.out.println("------------------------");

        //2.浮点数计算
        //细节：浮点数直接参与计算，结果是有可能不精确的
        double c = 10;
        double d = 3;
        System.out.println(c+d);
        System.out.println(c-d);
        System.out.println(c*d);
        System.out.println(c/d);
        System.out.println(c%d);
    }
}
