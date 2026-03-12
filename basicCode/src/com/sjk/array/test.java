package com.sjk.array;

public class test {
    public static void main(String[] args){
        /*
        需求：交换两个变量

        细节：借助第三方变量缓存临时数据
         */

        int a = 10;
        int b = 20;
        int c = 0;  // 临时变量
        System.out.println(a);
        System.out.println(b);

        System.out.println("交换后：");

        c = a;  // a的值保存在c中
        a = b;  // b的值保存在a中
        b = c;  // c的值保存在b中
        System.out.println(a);
        System.out.println(b);
    }
}
