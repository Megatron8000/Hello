package com.java.hello.package24;

import java.io.*;

public class Serialization {

    public boolean serializator(Cat cat) {
        boolean flag = false;

        File file = new File("C:\\Users\\Alexander\\IdeaProjects\\cat.data");  //файл в который записывается сериализуемый объект
        ObjectOutputStream oos = null; // поток для работы с объеками, необходим для сериализации

        try {
            FileOutputStream fos = new FileOutputStream(file);
            if (fos != null) {  //проверка корректности пути к файлу
                oos = new ObjectOutputStream(fos);
                oos.writeObject(cat);
                flag = true;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null){  //при закрытии потока необходимо осуществлять проверку на null
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return flag;
    }
}