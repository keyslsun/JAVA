package com.sjk.looploop;

public class looploopDemo1 {
    public static void main(String[] args){
        /*
    需求：通过循环打印4行五列的：*****
     */

        for (int i = 1; i < 5; i++){    //循环执行4次
            for (int j = 1; j <= 5; j++){
                System.out.print("*");  //循环体打印5次
            }
            System.out.println();   //换行
        }
    }
}
