package com.sjk.oop;

public class test {
    public static void main(String[] args) {
        /*
        需求：定义一个JavaBean类描述学生
        属性：姓名，年龄，性别

         */

        //创建Student对象
        Student s1 = new Student();
        //获取对象属性值并打印
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getSex());
        //创建Student对象
        Student s2 = new Student("小王",18,"男");

        //获取对象属性值并打印
        System.out.println(s2.getName() + " " + s2.getAge() + " " + s2.getSex());
    }
}
