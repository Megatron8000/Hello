package com.java.hello.module17;

public class Crow extends Birds {

    public Crow(String name, Wings wings) { //обязательно дублируется конструктор из суперкласса
        super(name, wings);
    }

    public void fly(){
            System.out.println("I crow and I can fly");
        }
}
