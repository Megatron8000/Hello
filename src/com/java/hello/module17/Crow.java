package com.java.hello.module17;

public class Crow extends Birds {

    public void fly(){
            System.out.println("I crow and I can fly");
        }

    @Override
    public void walk() {
        System.out.println("I'm a crow, I like to shit on the fly");
    }
}
