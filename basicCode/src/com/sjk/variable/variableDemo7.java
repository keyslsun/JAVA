package com.sjk.variable;

//找到Scanner的位置
import java.util.Scanner;

public class variableDemo7 {
    public static void main(String[] args) {
        //1.找到Scanner的位置
        Scanner sc = new Scanner(System.in);
        //2.调用Scanner的方法
        System.out.println("请输入你的身高：（米）");
        double height = sc.nextDouble();
        System.out.println("请输入你的体重：（KG）");
        double weight = sc.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("你的BMI是：" + bmi);



    }
}
