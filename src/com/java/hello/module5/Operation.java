package com.java.hello.module5;

public class Operation {
    int a = 5, b = 6, c;
    String s1 = "Hot ", s2 = "Dog", result;

    public void foo(){
        c = a + b*2;
        result = s1 + s2;
        System.out.println(c);
        System.out.println(result);
        System.out.println(Math.PI - Math.sin(a));
    }
}
