package com.sjk.operator;

public class operatorDemo3 {
    public static void main(String[] args) {

        //1.定义seconds
        int seconds = 3800 ;

        //2.计算小时数
        int hours = seconds / 3600;//1小时=3600秒

        //3.计算分钟数
        int minutes = (seconds - hours * 3600) / 60;//1分钟=60秒

        //4.计算秒数
        int second = seconds - hours * 3600 - minutes * 60;

        //5.输出结果
        System.out.println(hours + "小时" + minutes + "分" + second + "秒.");
    }
}
