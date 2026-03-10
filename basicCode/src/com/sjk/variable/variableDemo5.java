package com.sjk.variable;

//确定scanner的位置
import java.util.Scanner;

public class variableDemo5 {
    public static void main(String[] args) {
/*        键盘录入：
            第一步：让scanner找到录入的数据
            第二步：调用scanner的方法*/

        //1.第一步：找到scanner这个打工人
        Scanner sc = new Scanner(System.in);

        //第二步：调用scanner的方法
        //接收录入的整数
        int a = sc.nextInt();
        System.out.println(a);
        //接收录入的小数
        double b = sc.nextDouble();
        System.out.println(b);
        //接收录入的文本
        String c = sc.next();
        System.out.println(c);
    }
}
