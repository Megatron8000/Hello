package com.java.hello.module1;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {


    public static void main(String[] args){

        FileInputStream fis = null;
        int a = 0;

        try {
             fis = new FileInputStream("D:/1.txt");
            try {
              while ((a = fis.read()) != -1);{
                    System.out.println((char)a);
                }
            } catch (IOException e) { //проверка на ошибку чтения
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) { //проверка корректности пути к файлу
            e.printStackTrace();
        }
    }
}

