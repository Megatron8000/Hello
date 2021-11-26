package com.java.hello.module17;
//описание общих свойств для всех птиц
public class Birds {
    private String name;

    public void walk() {
        System.out.println("Walk");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


