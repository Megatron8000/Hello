package com.java.hello.module17;
//описание общих свойств для всех птиц
public class Birds {
        private String name;
        private Wings wings;

    public Birds(String name, Wings wings) {
        this.name = name; //this указывает на использование переменной конкретно этого класса
        this.wings = wings;
    }

    public void walk() {
            System.out.println("Walk");
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wings getWings() {
        return wings;
    }

    public void setWings(Wings wings) {
        this.wings = wings;
    }
}
