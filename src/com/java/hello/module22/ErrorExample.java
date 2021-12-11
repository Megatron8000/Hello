package com.java.hello.module22;

public class ErrorExample {
    public void foo(){
        System.out.println(1/0); //исключение типа RuntimeException, ошибка в арифметической операции
    };
}
