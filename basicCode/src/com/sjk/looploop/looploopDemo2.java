package com.sjk.looploop;

public class looploopDemo2 {
    public static void main(String[] args) {
        /*
        需求：打印一个正三角形和一个倒三角形
         */

        //1.打印正三角形
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2.换行
        System.out.println();

        //3.打印倒三角形
        for (int i = 1; i <= 5; i++){
            for (int j = 5; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
