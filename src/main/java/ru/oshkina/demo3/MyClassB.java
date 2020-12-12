package ru.oshkina.demo3;

public class MyClassB extends MyClass {

    MyClassB(int code) {
        super(code);
    }

    @Override
    void show() {
        System.out.println("объект b: " + code);
    }
}
