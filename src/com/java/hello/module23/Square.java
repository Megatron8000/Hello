package com.java.hello.module23;

public class Square {
    static double side;

    public static double getSide() {
        return side;
    }

    public static void setSide(double side) throws PerimeterException {
        if(side<=0){
            throw new PerimeterException("Side is incorrect"); //проверка валидности значения side
        }
        Square.side = side;
    }
}
