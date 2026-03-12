package com.sjk.array;

public class arrayDemo1 {
    public static void main(String[] args) {
        /*
        需求：数组的初始化
        1.定义数组存储5个学生的成绩
        2.通过键盘输入3个学生的姓名
        3.通过键盘输入3个学生的年龄
         */

        //1.定义成绩数组
        int arr [] = {80, 90, 100, 70, 60}; //静态初始化
        System.out.println(arr[2]); //输出第三个成绩

        //2.定义姓名数组
        String name [] = {"张三", "李四", "王五"};
        System.out.println(name[0] + "," + name[1] + "," + name[2]);    //输出三个姓名

        //3.定义年龄数组
        int age [] = {18, 19, 20};
        System.out.println(age[2]);


    }
}
