package com.sjk.loopfor;

import java.util.Scanner;

public class ForDemo7 {
    public static void main(String[] args) {
        /*
        需求：计算下列数列前n项的和
        S(n) = 1 - 2 + 3 - 4 ...
        规则：奇数+偶数-
         */

        //1.创建变量保存和
        int sum = 0;

        //2.获取用户输入
        System.out.println("请输入n：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //3.循环
        for (int i = 1; i <= n; i++){
            if (i % 2 == 0){
                sum -= i;
            }else{
                sum += i;
            }
        }

        //4.输出结果
        System.out.println(sum);

    }
}
