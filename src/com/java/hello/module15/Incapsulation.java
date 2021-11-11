package com.java.hello.module15;

public class Incapsulation {
    private double p = Math.PI;
    private int a, b;

    public double result(){
        double c = p * (a + b);
        return c;
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
