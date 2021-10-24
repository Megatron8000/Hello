package com.java.hello.module11;

public class Constructor {
    public void foo(){
        Flower flower = new Flower(); //способ описания объекта без конструктрора
        flower.name = "Ромашка";
        flower.color = "Желтая";

        Flower secondFlower = new Flower("Роза", "Красная"); //Описание объекта с конструктором
    }
}
