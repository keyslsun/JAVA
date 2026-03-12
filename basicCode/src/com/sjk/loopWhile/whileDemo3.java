package com.sjk.loopWhile;

public class whileDemo3 {
    public static void main(String[] args) {
        /*
        需求：珠穆朗玛峰的高度是8848米，换成毫米是：8848000 毫米
        我有一张足够大的纸，它的厚度是0.1毫米
        珠穆朗玛峰需要多少张纸才能折叠出来？

        分析：纸张折叠 paper * 2

        循环条件：
        折叠的纸张数 < 珠穆朗玛峰高度

         */

        //1.定义变量
        int height = 8848000;
        double paper = 0.1; //纸张厚度

        //2.定义纸张数
        int count = 0;

        //2.使用循环，计算折叠的纸张数
        while(paper < height){
            paper = paper * 2;  //纸张折叠
            count++;    //折叠的次数加1
        }

        //3.输出结果
        System.out.println("需要折叠的纸张次数：" + count + "次。");

    }
}
