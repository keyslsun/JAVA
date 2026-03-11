package com.sjk.operator;

public class operatorDemo6 {
    public static void main(String[] args) {
        /* 练习：
        实现单个字母的大小写转换
        将大写的转换成小写，将小写的转换成大写
         */

        //1.定义字符
        char a = 'a';
        char b = 'A';

        //2.进行转换
        //同字母的大小写之间总是相差 32 个字符
        char c = (char)(a - 32); //a - 32 = A
        char d = (char)(b + 32); //A + 32 = a

        System.out.println(c);
        System.out.println(d);

    }
}
