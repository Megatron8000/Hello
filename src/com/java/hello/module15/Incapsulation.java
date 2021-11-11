package com.java.hello.module15;

public class Incapsulation {
    private int a, b;

    public int result(){
        return a+b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
}
