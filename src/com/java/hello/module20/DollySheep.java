package com.java.hello.module20;

public class DollySheep implements Cloneable{  //получить возможность клонировать объект
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
