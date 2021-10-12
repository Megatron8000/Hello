package com.java.hello.module6;

public class ControlOperations {
    int a = 5, b = 9;
    boolean value = false;

    public void foo(){
        if (value){
            System.out.println("True");
            a++;
            if (a<b){
                System.out.println("Still true");
        }

        }
        else if (a>b){
            System.out.println("False");
        }
        else{
            System.out.println("Drop application");
        }
    }

}
