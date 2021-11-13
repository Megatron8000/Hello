package com.java.hello.module16;

public enum Music {
    CLASSIC(0,"classic"), ROCK(1, "Rock"), POP(2, "Pop");

    private int i;
    private String s;

    public int getI() {
        return i;
    }

    public String getS() {
        return s;
    }

    Music(int i, String s) {
        this.i = i;
        this.s = s;


    }
}
