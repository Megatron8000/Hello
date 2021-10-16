package com.java.hello.module8;

public class Loop {
    int a = 5, b =70;

    public void foo(){
        /*while (a<b){ //цикл будет выполняться пока выражение - истина
            System.out.println(a);
            a++;*/

        do {
            a++;
            System.out.println(a);
        } while (a<b);
    }
}
