package com.java.hello.module2;

public class Numbers {
    //целочисленные типы
    static byte a = 8;   //2^8
    static short b = 169; //2^16
    static int c = 36222;  //2^32
    static long d = 10_000_000L; //2^64

    //символ
    static char e = 'l'; // символы unicode ~65k

    //дробные числа
    static float f = 3.14f; //2^32
    static double g = 67.54620983; //2^64

    //логичский тип
    static boolean h = true; //в массивах 6bit не в массивах 32bit

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }

}
