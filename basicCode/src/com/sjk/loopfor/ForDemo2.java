package com.sjk.loopfor;

public class ForDemo2 {
    public static void main(String[] args) {
        /*
        需求：
        1.打印 1-5
        2.打印 5-1
         */

        //1.打印 1-5
        for (int i = 1; i <= 5; i++){
            System.out.println(i);  //输出 i(变量)
        }

        System.out.println("===========");

        //2.打印 5-1
        for (int i = 5; i >= 1; i--){
            System.out.println(i);
        }
    }
}
