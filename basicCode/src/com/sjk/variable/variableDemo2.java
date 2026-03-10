package com.sjk.variable;

public class variableDemo2 {
    public static void main(String[] args) {
        /*
            我方：叉子      对方：长手
            攻击：220       攻击：210
            防御：85        防御：80
            血量：1012.5    血量：1223.3
            技能加成： 1.2  技能加成：1.3

            技能造成伤害的公式：攻击力 * 技能加成 - 对方防御力
            普攻造成伤害的公式：攻击力 - 对方防御力

            计算：
            我方第一次进行普通攻击，造成多少伤害，对方还剩余多少血量？
            我方第二次进行技能攻击，造成多少伤害，对方还剩余多少血量？

            规则：经常发生改变的数据，用变量记录
        */

        //1.定义变量记录我方的攻击力
        double myAttack = 220;

        //2.定义变量记录我方的防御
        double myDefense = 85;

        //3.定义变量记录我方的血量
        double myHp = 1012.5;

        //4.定义变量记录我方的技能加成
        double mySkillAdd = 1.2;

        //5.定义变量记录对方的攻击力
        double enemyAttack = 210;

        //6.定义变量记录对方的防御力
        double enemyDefense = 80;

        //7.定义变量记录对方的血量
        double enemyHp = 1223.3;

        //8.定义变量记录对方的技能加成
        double enemySkillAdd = 1.3;

        //9.我方第一次进行普通攻击，造成多少伤害，对方还剩余多少血量？
        double Damage1 = myAttack - enemyDefense;
        enemyHp = enemyHp - Damage1;
        System.out.println("我攻击了对方，造成伤害：" + Damage1 + "，对方还剩余" + enemyHp + "血");

        //10.我方第二次进行技能攻击，造成多少伤害，对方还剩余多少血量？
        double Damage2 = myAttack * mySkillAdd - enemyDefense;
        enemyHp = enemyHp - Damage2;
        System.out.println("我使用了技能攻击，造成伤害：" + Damage2 + "，对方还剩余" + enemyHp + "血");
    }
}
