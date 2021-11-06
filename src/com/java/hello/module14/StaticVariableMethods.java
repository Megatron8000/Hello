package com.java.hello.module14;

public class StaticVariableMethods {
        public static int variable;   // общее поле для всех объектов данного класса
        public int variable1; // не статические перенменные нельзя использовать в методах класса

            public static void foo(){
                System.out.println(variable);
            }

            public void show(){
                System.out.println("Show must go on");
                foo();
            }
}
