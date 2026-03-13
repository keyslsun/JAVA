package com.sjk.javaClass;

public class dogDemo1 {
    public static void main(String[] args) {
        //创建对象，记录信息
        DogClassDemo dog = new DogClassDemo();  //同目录无需引用类名，可以直接创建对象
        //赋值
        dog.name = "小黄";
        dog.age = 2;
        dog.sex = "公";
        //输出
        System.out.println("名字：" + dog.name + "  年龄：" + dog.age + "  性别：" + dog.sex);
    }
}
