package com.java.hello.module17;

public class Ostrich extends Birds{  //extends - наследование свойств указанного класса


    public Ostrich(String name, Wings wings) {
        super(name, wings);
    }

    public void hideHead(){
                System.out.println("I ostrich and I scared");
            }
}
