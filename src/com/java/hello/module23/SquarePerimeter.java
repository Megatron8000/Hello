package com.java.hello.module23;

public class SquarePerimeter {

        public void getPerimeter() {
            Square square = new Square();
            try {
                square.setSide(5.5);
            } catch (PerimeterException e) {
                e.printStackTrace();
            }
        }
}
