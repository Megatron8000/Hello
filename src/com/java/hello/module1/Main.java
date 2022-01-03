package com.java.hello.module1;


import java.io.*;

public class Main {


    public static void main(String[] args){

        FileInputStream fis = null;
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
            }
        }
    }
}

