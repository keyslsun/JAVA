package com.sjk.method;

import java.util.Scanner;

public class methodDemo5 {
    public static void main(String[] args) {
        /*
        需求：班主任需要统计十名学生的成绩（0-100）
        计算及格率，平均分，并找出最高分
        1.键盘录入十个学生的成绩，存入数组
        2.定义方法求及格人数，及格率
        3.定义方法求总和再求平分
        4.定义方法求最高分
         */

        //1.定义
        double[] scores = new double[10];
        double sum = 0;
        int passCount = 0;
        double max = 0;
        double avg = 0;
        int passRate = 0;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++){
            System.out.println("请输入第" + (i+1) + "个学生的成绩：");
            scores[i] = sc.nextDouble();
            if (scores[i] < 0 || scores[i] > 100){
                System.out.println("输入的分数有误！请重新输入第" + (i+1) + "个学生的成绩：");
                i--;
            }
        }

        //5.调用方法获取及格人数和及格率

        passCount = getCount(scores);
        System.out.println("及格人数为：" + passCount);
        passRate =  getRate(scores);
        System.out.println("及格率为：" + passRate + "%");

        //6.调用方法求总分及平均分
        sum = getSum(scores);
        avg = getAvg(scores);
        System.out.println("总分为：" + sum + "，平均分为：" + avg);

        //7.调用方法求最高分
        max = getMax(scores);
        System.out.println("最高分为：" + max);


    }

    //2.定义方法求及格人数
    public static int getCount(double[] arr){
        int passCount = 0;  //定义声明及格人数
        for (int i = 0; i < arr.length; i++){
            if (arr[i] >= 60){
                passCount++;    //满足条件，计数器加1
            }
        }
        return passCount;   //返回及格人数
    }

    //定义方法求及格率
    public static int getRate(double[] arr){
        int passCount = getCount(arr);  //获取及格人数
        int passRate = passCount * 100 / arr.length;    //计算及格率
        return passRate;    //返回及格率
    }

    //3.定义方法求总和再求平分
    public static double getSum(double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum; //返回总和
    }

    //求平均分
    public static double getAvg(double[] arr){
        double avg = getSum(arr) / arr.length;
        return avg;
    }

    //4.定义方法求最高分
    public static double getMax(double[] arr){
        double max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
