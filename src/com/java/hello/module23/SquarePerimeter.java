package com.java.hello.module23;

public class SquarePerimeter {

    public double getPerimeter(String s) throws PerimeterException {
        Square square = new Square();

        double i = square.setSide(5.6);
        double perimeter = i * 4;
        try {
            double side = Double.parseDouble(s); //приведение строки к дроби
            }

        catch (NumberFormatException e){
          throw new PerimeterException("String is incorrect", e);
        }
        return i;
    }
}
