package com.java.hello.module23;

public class SquarePerimeter {

    public void getPerimeter(String s) throws PerimeterException {
        Square square = new Square();


        try {
            double side = Double.parseDouble(s); //приведение строки к дроби
        } catch (NumberFormatException e) {
            throw new PerimeterException("String is incorrect", e); //проверка корретности введенного значения
        }
    }
}
