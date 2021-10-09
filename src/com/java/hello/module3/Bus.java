package com.java.hello.module3;

public class Bus {
   public String model; //поля класса - описание свойств объекта
   public String color;
   public String route;

    public void showColor(){  //методы класса - описание поведения объекта
        System.out.println(color);
    }

    public void showModel(){
        System.out.println(model);
    }

    public void showRoute(){
        System.out.println(route);
    }
}
