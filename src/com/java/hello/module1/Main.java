package com.java.hello.module1;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args){


        List<String> list = new ArrayList<>();
        list
        /*FileWriter fr = null;  //Класс позволяющий дописывать данные в файл

        String s = " Hot Java";

        try {
             fr = new FileWriter("C:\\Users\\Alexander\\IdeaProjects\\Hello\\1.txt", true); // true - флаг который показыает дописываать данные в файл или затереть исходные
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fr.write(s);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/


       /* FileInputStream fis = null;
        InputStreamReader isr = null;
        int a = 0;

        try {
             fis = new FileInputStream("C:\\Users\\Alexander\\IdeaProjects\\Hello\\1.txt");
            try {
                isr = new InputStreamReader(fis, "UTF-8");
            } catch (UnsupportedEncodingException e) { //проверка поддерживаемой кодировки
                e.printStackTrace();
            }
            try {
              while ((a = isr.read()) != -1){
                    System.out.println((char)a);
                }
            } catch (IOException e) { //проверка на ошибку чтения
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) { //проверка корректности пути к файлу
            e.printStackTrace();
        } finally { //закрываем потоки чтения
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }*/


        }
    }


