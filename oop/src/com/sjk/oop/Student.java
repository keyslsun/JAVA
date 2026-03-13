package com.sjk.oop;

public class Student {
    private String name;
    private int age;
    private String sex;

    public Student() {
    }

    public Student(String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    //set/get方法

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){    //属性取值
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setSex(String sex){
        this.sex = sex;
    }

    public String getSex(){
        return sex;
    }
}
