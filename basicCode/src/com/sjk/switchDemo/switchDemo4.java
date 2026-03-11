package com.sjk.switchDemo;

public class switchDemo4 {
    public static void main(String[] args) {
        /*
        switch的新特性：
        1.箭头标签(自带break)
        2.case后面可以有多个值
        3.switch可以有运行结果
        4.yield关键字
         */

        int number = 3;
        switch (number){
            case 1,2,3 -> System.out.println("一");
            case 4,5,6 -> System.out.println("二");
            case 7,8,9 -> System.out.println("三");
            case 10,11,12 -> System.out.println("四");
            default -> System.out.println("输入的数字有误");
        }

        //yield关键字：可以保留switch的运行结果
        int number2 = 5;
        String result = switch (number2){
            case 1,2,3 ->{
               yield "一";
            }
            case 4,5,6 ->{
               yield  "二";
            }
            case 7,8,9 ->{
               yield  "三";
            }
            case 10,11,12 ->{
               yield  "四";
            }
            default -> "输入的数字有误";
        };

        System.out.println(result); //输出运行结果

        //利用switch模拟计算器
        int a = 10;
        int b = 20;
        String operator = "+";

        int result2 = switch (operator){
            case "+" -> a + b; //只有一个执行语句所以省略了yield
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> 0;
        };

        System.out.println(result2);
    }
}
