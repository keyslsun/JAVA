package com.sjk.ifDemo;

import java.util.Scanner;

public class IfDemo2 {
    public static void main(String[] args) {
            /*
    需求:初始血量200，受到X点伤害，技能恢复Y血，X和Y由键盘录入
    假设，游戏人物不会死亡，最少剩一点血
    问：最终人物血量是多少
     */

        Scanner sc = new Scanner(System.in);

        //1.定义变量记录血量
        int hp = 200;

        //2.键盘录入伤害数据
        System.out.println("受到伤害：");
        int x = sc.nextInt();

        //3.计算当前血量
        hp = hp - x;
        //判断血量，人物不会死亡
        if(hp <= 0){
            hp = 1;
        }

        System.out.println("当前血量："+hp);

        //4.键盘录入技能恢复数据
        System.out.println("恢复血量：");
        int y = sc.nextInt();

        //5.计算当前血量
        hp = hp + y;

        //判断：血量恢复不可超过角色血量
        if (hp > 200){
            hp = 200;
        }
        System.out.println("当前血量："+hp);
    }
}
