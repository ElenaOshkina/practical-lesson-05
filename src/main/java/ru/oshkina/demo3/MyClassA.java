package ru.oshkina.demo3;

public class MyClassA extends MyClass {

    MyClassA(int code) {
        super(code);
    }

    @Override
    void show() {
        System.out.println("объект а: " + code);
    }
}
