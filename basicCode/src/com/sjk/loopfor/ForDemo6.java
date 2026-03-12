package com.sjk.loopfor;

public class ForDemo6 {
    public static void main(String[] args) {
        /*
        需求：有一组特殊的数字，每三项都是前两项的和
        0，1，1，2，3，5，8，13，21，34，55，89
        提问：第十项是多少？

         */

        //1.定义变量
        int a = 0;
        int b = 1;
        int c = 0;

        //2.使用循环，求出第十项
        for (int i = 1; i <= 10; i++) {
            c = a + b;
            //更新ab的值
            a = b;
            b = c;
        }

        //3.输出结果
        System.out.println(c);
    }
}
