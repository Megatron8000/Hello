package com.java.hello.module18;

public abstract class Weapton {  //абстракция - общее обисание для группы классов
    public String name;

    public abstract void foo(); //абстрактные методы не имеют реализации и должны переопределяться в потомках

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
