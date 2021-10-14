package com.java.hello.module7;

public class Switch {
   final int a = 2, b = 4, c = 6, d = 9;

    public void foo() {
        switch (a){
            case b:
                System.out.println(b);
                break;
            case c:
                System.out.println(c);
                break;
            case d:
                System.out.println(d);
                break;
            default:
                System.out.println("JOPA");
        }
    }
}
