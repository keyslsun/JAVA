package com.sjk.method;

public class methodDemo4 {
    public static void main(String[] args) {
        /*
        需求：给定两个长方形，比较它们的面积谁更大
        如何定义方法

        小诀窍
        1.观察在大段的代码中，反复使用的功能是什么？
        2.这个独立功能需要什么才能完成？
        3.方法的调用处，是否需要返回值去做其他事情？void？

         */

        //1.创建长方形
        double length1 = 10;
        double width1 = 20;
        double length2 = 20;
        double width2 = 30;

        //2.定义公式(调用方法)
        double area1 = getArea(length1,width1) ;
        double area2 = getArea(length2,width2) ;

        //5.调用方法进行比较
        compare(area1,area2);


    }

    //3.定义方法获取长方形面积
        public static double getArea(double length,double width){   //设置两个形参
        return length * width;  //返回值
        }

        //4.定义比较方法
        public static void compare(double areaA,double areaB){
            if (areaA > areaB) {    //判断
                System.out.println("第一个长方形更大"); //输出结果
            } else if (areaA < areaB) {
                System.out.println("第二个长方形更大");
            } else {
                System.out.println("两个长方形面积相等");
            }
        }
}
