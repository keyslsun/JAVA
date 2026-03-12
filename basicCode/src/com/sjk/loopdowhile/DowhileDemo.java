package com.sjk.loopdowhile;

public class DowhileDemo {
    public static void main(String[] args) {
        int i = 10;

        do {
            System.out.println("hello world"); //do的特性：先执行循环体，再判断循环条件
            i++;
        } while (i < 10); //循环条件为false，终止循环

    }
}