package com.sjk.javaClass;

public class StudentDemo1 {
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.name = "小王";
        S1.age = 18;
        S1.score = 90;
        S1.sex = "男";
        System.out.println("姓名：" + S1.name + "，年龄：" + S1.age + "，成绩：" + S1.score + "，性别：" + S1.sex);
    }
}
