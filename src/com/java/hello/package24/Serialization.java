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
            if (oos != null) {  //при закрытии потока необходимо осуществлять проверку на null
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return flag;
    }

    public Cat deserialization() {
        File file = new File("C:\\Users\\Alexander\\IdeaProjects\\cat.data");
        ObjectInputStream ois = null;
        Cat cat = null;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (fis != null) {
            try {
                ois = new ObjectInputStream(fis);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                cat = (Cat) ois.readObject();

            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                if (ois != null) {
                    try {
                        ois.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
        return cat;
    }
}