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
        else{
            System.out.println("False");
        }
    }

}
