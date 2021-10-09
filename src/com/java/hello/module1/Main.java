package com.java.hello.module1;

import com.java.hello.module3.Bus;

public class Main {
    public static void main(String[] args) {
        Bus firstBus = new Bus(); //объявление и ининциализвция нового объекта firstBus класса Bus
        Bus secondBus = new Bus();
        Bus anotherBus = new Bus();

        firstBus.color = "Red";
        secondBus.color = "Yellow";
        anotherBus.color = "Blue";

        firstBus.model = "MAN";
        secondBus.model = "MAZ";
        anotherBus.model = "KAMAZ";

        firstBus.route = "41";

        firstBus.showModel();
        firstBus.showColor();
        firstBus.showRoute();
        secondBus.showModel();
        secondBus.showColor();
        anotherBus.showModel();
        anotherBus.showColor();


    }
}
