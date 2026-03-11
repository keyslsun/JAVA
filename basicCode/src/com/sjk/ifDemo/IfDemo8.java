package com.sjk.ifDemo;

import java.util.Scanner;

public class IfDemo8 {
    public static void main(String[] args) {
        /*
        需求：输入变量x,y ，判断点所在区域
        情况1：原点：(0,0)
        情况2：第一象限：(x>0,y>0)，第二象限：(x<0,y>0)，第三象限：(x<0,y<0)，第四象限：(x>0,y<0)
        情况3：在y轴上：(x=0,y!=0)
        情况4：在x轴上：(x!=0,y=0)
         */

        //1.定义变量
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入x：");
        int x = sc.nextInt();
        System.out.println("请输入y：");
        int y = sc.nextInt();

        //2.判断
        if (x!=0 && y!=0){
            if (x>0 && y>0){
                System.out.println("第一象限");
            } else if (x<0 && y>0) {
                System.out.println("第二象限");
            } else if (x<0 && y<0) {
                System.out.println("第三象限");
            } else if (x>0 && y<0){
                System.out.println("第四象限");
            } else if (x==0 && y!=0){
                System.out.println("在y轴上");
            } else if (x!=0 && y==0){
                System.out.println("在x轴上");
            }
        } else {
            System.out.println("原点");
        }
    }
}
