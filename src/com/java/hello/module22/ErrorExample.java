package com.java.hello.module22;

public class ErrorExample {

    public SomeClass someClass;



    public void foo(){
        System.out.println(1/0); //исключение типа RuntimeException, ошибка в арифметической операции
    }
    public void foo1(){
        int[] array = {1,2,3};
        array[5] = 6;   //исключение типа RuntimeException, индекс за пределами массива
    }
    public void foo2(){
        try {
            someClass.foo();
        } catch (Exception e){
            System.err.println("Класс не создан");
        }
    }
}
