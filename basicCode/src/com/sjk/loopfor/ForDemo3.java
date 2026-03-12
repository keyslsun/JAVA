package com.sjk.loopfor;

public class ForDemo3 {
    public static void main(String[] args) {
        /*
        需求：求1-5之间的和
         */

        //1.定义和
        int sum = 0;

        //2.使用循环，求变量的和
        for (int i = 1; i <= 5; i++){
            sum += i; //sum = sum + i;
        }

        //3.输出结果
        System.out.println(sum);
    }
}
