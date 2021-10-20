package com.java.hello.module10;

public class Arrays {
    int[] array = new int[5]; //массив примитивных типов
    Element[] box = new Element[10]; //массив ссылочных типов

   int[] sample = {55, 66, 77, 8, 9, 33, 56, 22222};  //пример объявления массива с инициализацией

   /*  Element eFirst = new Element();
       Element eSecond = new Element();
       Element eThird = new Element();

    Element[] pack = {eFirst, eSecond, eThird};*/


    public void foo(){
         Element element = new Element();
         box[0] = element;
        System.out.println(box[0]);

        for (int i = 0; i<sample.length; i++){
            System.out.println(sample[i]);
        }
    }
}

