package com.sjk.loopfor;

public class ForDemo4 {
    public static void main(String[] args) {
        /*
        需求： 输出1-100之间的偶数和
         */

        //1.定义和
        int sum = 0;

        //2.使用循环，求变量的和
/*        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {   //判断i是否为偶数，若是偶数才执行语句
                sum += i;
            }
        }*/

        //方法2：+2
        for (int i = 2; i <= 100; i += 2) { //初始化令i为2，循环条件i<=100，每次循环i+=2。保证i为偶数。
            sum += i;
        }


        //3.输出结果
        System.out.println(sum);
    }
}
