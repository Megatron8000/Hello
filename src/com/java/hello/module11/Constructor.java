package com.java.hello.module11;

public class Constructor {
    public void foo(){
        Flower flower = new Flower(); //способ описания объекта c конструктором по умолчанию
        flower.name = "Ромашка";
        flower.color = "Желтая";

        Flower secondFlower = new Flower("Роза", "Красная"); //Описание объекта с конструктором

        System.out.println(secondFlower.name + " " + secondFlower.color);
        System.out.println(flower.name + " " + flower.color);
    }
}
