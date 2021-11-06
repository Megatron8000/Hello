package com.java.hello.module14;

public class StaticVariableMethods {
        public static int variable;   // общее поле для всех объектов данного класса
        public int variable1; // не статические перенменные нельзя использовать в методах класса

                static {
                    variable = foo();
                }

            public static int foo(){
                System.out.println(variable);
                return 19;
            }

            public void show(){
                System.out.println("Show must go on");
                foo();
            }
}
