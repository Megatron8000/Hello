package com.java.hello.module1;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {


    public static void main(String[] args){


        try {
            FileInputStream fis = new FileInputStream("D:/1.txt");\
            try {
                fis.read();
            } catch (IOException e) { //проверка на ошибку чтения
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) { //проверка корректности пути к файлу
            e.printStackTrace();
        }

    }
}

