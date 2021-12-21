package com.java.hello.module1;

//import com.java.hello.module3.Bus;
//import com.java.hello.module5.Operation;
//import com.java.hello.module6.ControlOperations;
//import com.java.hello.module7.Switch;
//import com.java.hello.module8.Loop;
//import com.java.hello.module10.Arrays;
//import com.java.hello.module9.ForLoop;
//import com.java.hello.module11.Constructor;
//import com.java.hello.module12.Modifiers;

import com.java.hello.module13.Bus;
import com.java.hello.module14.StaticVariableMethods;
import com.java.hello.module15.Incapsulation;
import com.java.hello.module16.Music;
import com.java.hello.module17.Birds;
import com.java.hello.module17.Common;
import com.java.hello.module17.Crow;
import com.java.hello.module17.Ostrich;
import com.java.hello.module18.Rifle;
import com.java.hello.module18.Weapton;
import com.java.hello.module19.Boeing737;
import com.java.hello.module19.Mi8;
import com.java.hello.module19.Test;
import com.java.hello.module20.DollySheep;
import com.java.hello.module21.*;
import com.java.hello.module22.ErrorExample;
import com.java.hello.module23.Square;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
       /* Bus firstBus = new Bus();

           firstBus.color = "Red";
           firstBus.model = "MAN";
           firstBus.route = "41";

              firstBus.showModel();
              firstBus.showColor();
              firstBus.showRoute();*/

       /* Operation oper = new Operation();
        oper.foo();*/

        /*ControlOperations example = new ControlOperations();
        example.foo();*/

        /*Switch sw = new Switch();
        sw.foo();*/

        /*Loop loop = new Loop();
        loop.foo();*/

        /*ForLoop floop = new ForLoop();
        floop.foo();*/

        /*Arrays array = new Arrays();
        array.foo();*/

       /*Constructor constructor = new Constructor();
        constructor.foo();*/

        /*Modifiers.foo();*/

        /*Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("Hello, " + s);*/

        /*Bus bus = new Bus();
        bus.go();
        System.out.println(bus.odometer());*/


        /*StaticVariableMethods s = new StaticVariableMethods();
        s.show();*/

        /*Incapsulation i = new Incapsulation();
        i.setA(15);
        i.setB(354);
            System.out.println(i.result());*/


       /* Music genre0 = Music.ROCK;
        Music genre1 = Music.valueOf(Music.class, "ROCK"); // альтернативный способ создания объекта класса enum

        System.out.println(genre0.getI());
        System.out.println(genre0.getS());

            switch (genre0){
                case CLASSIC:
                    System.out.println("Classic");
                    break;
                case POP:
                    System.out.println("Pop");
                    break;
                case ROCK:
                    System.out.println("Rock");
            }

        for (Music element: Music.values()){
            System.out.println(element);}*/


        /* Ostrich ostrich = new Ostrich();
        Birds crow = new Crow(); // альтернативный способ создания объекта класса Crow при наследовании

       ostrich.hideHead();
        ostrich.setName("Kakadoo");

        ostrich.walk();
        ostrich.walk("around");

        Common common = new Common();
        common.foo(ostrich);*/

        /*Weapton w = new Rifle();
        w.setName("Enfield");

        System.out.println(w.name);
        w.foo();
        }*/

       /* Mi8 mi8 = new Mi8();
        Boeing737 boeing737 = new Boeing737();

        Test test = new Test();
        test.foo(mi8); //может принимать как родительский класс, так и всех наследников
        test.foo(boeing737);

        test.vertical(mi8);

        DollySheep dollySheep = new DollySheep();
        DollySheep dollySheep2 = foo(dollySheep);

        dollySheep.setName("Dolly");
        dollySheep2.setName("Dooly");

        System.out.println(dollySheep.getName());
        System.out.println(dollySheep2.getName());

    }
     //Реализация клонирования объекта
    public static DollySheep foo(DollySheep dollySheep2) {
        DollySheep sheep = null;
      try {
           sheep = (DollySheep) dollySheep2.clone();
      } catch (CloneNotSupportedException e) {
          e.printStackTrace();
      }
      return sheep;*/

        /*String s1 = new String("Hot Java");
        String s2 = "Computer";
        String [] s3 = s1.split(" "); // строка приводится в массв, разделителем слкжит указаный индекс

        for (String element: s3){
            System.out.println(element);
        }

        char [] chars = s2.toCharArray();
            for (char element: chars){
                System.out.println(element);
            }

        System.out.println(String.copyValueOf(chars)); //приведение массива символов к строке

         System.out.println(s2.isEmpty());*/

           /* String s1 = new String("Java");
            System.out.println(s1.concat(" Hot")); //создается новый объект
            System.out.println(s1);

            StringBuilder stringBuilder = new StringBuilder("Java");
            System.out.println(stringBuilder.append(" Hot"));
            System.out.println(stringBuilder);  // продолжается работа с исходным объектом

            System.out.println(stringBuilder.insert(0, 'j'));
            System.out.println(stringBuilder.deleteCharAt(1));
            System.out.println(stringBuilder.reverse());*/


       /* Body body = new Body();
        SmallHead smallHead = new SmallHead();
        MediumHead mediumHead = new MediumHead();
        BigHead bigHead = new BigHead();

            Robot<SmallHead> robot = new Robot<SmallHead>(body,smallHead);
            Robot<BigHead> robot1 = new Robot<BigHead>(body,bigHead);

            robot.getHead().burn();
            robot1.getHead().cry();
            smallHead.speak();*/

       /* ErrorExample errorExample = new ErrorExample();
        errorExample.foo2();*/


        Square square = new Square();

    }
}

