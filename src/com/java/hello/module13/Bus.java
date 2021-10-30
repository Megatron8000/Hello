package com.java.hello.module13;

public class Bus {
    public String model, color;
    public Engine engine;
    public Transmission transmission;
    public final String serial = "x9664";  //final - для констант

        public void go(){
            System.out.println("WROOOM-WROOOOM");
        }

        public String odometer(){
            String str = "99.666 km";
            return str;
        }

}
