package com.sjk.infiniteloop;

public class InfiniteLoopDemo {
    public static void main(String[] args) {
        /*
        三种格式的无限循环：for、while、do while

        注意：无限循环下不能有代码，否则报错
         */

        //1. for
/*        for(;;){
            System.out.println("hello world");
        }
        */
        //2. while
/*        while(true){
            System.out.println("你好美");
        }*/

        //3. do while
        do {
            System.out.println("你好帅");
        } while ( true );
    }
}
