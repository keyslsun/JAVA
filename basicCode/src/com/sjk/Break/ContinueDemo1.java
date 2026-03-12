package com.sjk.Break;

import java.util.Scanner;

public class ContinueDemo1 {
    public static void main(String[] args) {
        /*
        需求：循环打印1-100间的整数，如果数字包含7或是7的倍数，则不打印且输出“过”
         */

        //1. 循环打印
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {   //判断是否包含7
                System.out.println("过");    //输出“过”
                continue;
            }
            System.out.println(i);  //输出数字
        }
    }
}
