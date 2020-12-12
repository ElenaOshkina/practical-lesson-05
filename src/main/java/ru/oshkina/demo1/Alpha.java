package ru.oshkina.demo1;

import java.util.Objects;

//Использование объектной перемнной
public class Alpha {
    int code;
    String name;

    public Alpha(int code, String name) {
        this.code = code;
        this.name = name;
    }

    void show() {
        System.out.println("Класс Alpha");
    }
}
