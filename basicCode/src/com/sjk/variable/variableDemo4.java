package com.sjk.variable;

public class variableDemo4 {
    public static void main(String[] args) {
/*      BMI身体质量指数计算公式：BMI=体重÷身高² （体重单位：千克，身高单位：米）

        BMI 数值(kg/m²) 身体状态 健康风险

        <18.5 消瘦 部分增加

        18.5-23.9 正常 正常

        24.0-26.9 偏胖 增加

        27.0-29.9 肥胖 中度增加

        ≥30 严重肥胖 严重增加*/

        //1.定义变量记录我的体重：64.5KG
        double weight = 64.5;

        //2.定义变量记录我的身高：1.72M
        double height = 1.72;

        //3.计算BMI
        double bmi = weight/(height*height);
        System.out.println("我的BMI是："+bmi);

        //4.计算我当前的身高，在标准BMI下的最小体重和最大体重分别是多少
        double minWeight = height*height*18.5;
        double maxWeight = height*height*23.9;
        System.out.println("我的BMI在18.5-23.9之间的最小体重是："+minWeight+"kg");
        System.out.println("我的BMI在18.5-23.9之间的最大体重是："+maxWeight+"kg");
    }
}
