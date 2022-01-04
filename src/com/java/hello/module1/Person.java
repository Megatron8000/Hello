package com.java.hello.module1;

public class Person {
        private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {  // переопределяем toString чтобы получать строку, а не номер ячейки памяти
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
