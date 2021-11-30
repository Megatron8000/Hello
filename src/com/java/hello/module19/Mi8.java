package com.java.hello.module19;

public class Mi8 extends FlyingObjects implements VerticalTakeOf{
    @Override
    public void fly() {
        System.out.println("helicopter MI8 fly");
    }

    @Override
    public void verticalTakeOf() {
        System.out.println("MI8 can verticalTakeOf");
    }
}
