package com.sjk.javaClass2;

public class TeacherDemo1 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "张三";
        t1.age = 18;
        t1.sex = "男";
        System.out.println("姓名：" + t1.name + "，年龄：" + t1.age + "，性别：" + t1.sex);
        //让他行动
        t1.teach();
    }
}
