package com.java.hello.module17;

public class Ostrich extends Birds{  //extends - наследование свойств указанного класса


    public void hideHead(){
                System.out.println("I ostrich and I scared");
            }

            public void walk(String s){
                System.out.println("Walk" + " " + s);  // пример статического полиморфизма и перегрузки методов, в классе присутствуют два метода с однаковым именем, но разными принимаемыми значениями
            }
}
