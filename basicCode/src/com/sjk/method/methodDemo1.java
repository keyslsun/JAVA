package com.sjk.method;

public class methodDemo1 {
    public static void main(String[] args){
        /*
        需求:创建一个方法，求两个数值的和
         */

        //1.定义变量
        int a = 10;
        int b = 20;

        //3.调用方法
        int result = getSum(a, b);
        System.out.println(result);

    }
    //2.定义方法
    public static int getSum(int a, int b){
        int sum = a + b;
        return sum;
    }
}
