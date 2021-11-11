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

        Incapsulation i = new Incapsulation();
        i.setA(15);
        i.setB(354);
            System.out.println(i.result());




    }
}
