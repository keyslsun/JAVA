package com.sunjk.hello;
public class Helloworld {
    public static void main(String[] args){
        System.out.println("Hello, World");
        System.out.println(getVerifyCode());
    }

    //定义一个方法，帮我生成一个验证码返回
    public static String getVerifyCode(){
        String code = "";
        for(int i = 0; i < 4; i++){
            int number = (int)(Math.random() * 10);
            code += number;
        }
        return code;
    }
}
