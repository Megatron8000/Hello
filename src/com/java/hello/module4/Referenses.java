package com.java.hello.module4;

public class Referenses {
   static String str = "Asshole";
   static String str2 = new String("Asshole");

    public void sample(){
        new String(str);
    }

    public static void main(String[] args) {
        System.out.println(str2);
        System.out.println(str);
    }
}
