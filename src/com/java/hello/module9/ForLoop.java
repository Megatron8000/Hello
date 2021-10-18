package com.java.hello.module9;

public class ForLoop {
    int[] array = {1, 2, 3, 7, 4, 5, 8};

    public void foo() {
        for (int i = 0; i <= 10; i =i+2) {
            System.out.println(i);
        }
        for (int e : array) {
            System.out.println(e);
        }
    }
}



