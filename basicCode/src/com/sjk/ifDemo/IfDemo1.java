package com.sjk.ifDemo;

public class IfDemo1 {
    public static void main(String[] args){
        /*
        定义一个变量表示人的体温, 如果超出37.5,则提示该用户请隔离, 否则提示请继续健康
         */

        //1.定义变量
        double temperature = 36.5;
        //2.判断
        if(temperature > 37.5){
            System.out.println("请隔离");
        }   else{
            System.out.println("请继续健康");
        }
    }
}
