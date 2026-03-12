package com.sjk.looploop;

public class looploopDemo3 {
    public static void main(String[] args) {
        /*
        需求：打印一个平行四边形
         */

        //1.外循环
        for (int i = 1; i <= 3; i++){//循环次数为3
            //2.内循环：打印空格
            for (int j = 2; j >= i; j--){   //循环次数为2次
                System.out.print("  ");
            }

            //3.内循环：打印*
            for (int k = 1; k <= 6; k++){   //循环次数为6
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
