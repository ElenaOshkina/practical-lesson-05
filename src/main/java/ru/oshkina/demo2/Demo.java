package ru.oshkina.demo2;

public class Demo {
    public static void main(String[] args) {
        Bravo b = new Bravo();
        b.first();
        b.second();
        //объектная переменная абстрактного класса
        Alpha a;
        //ссылка на объект подкласса
        a = b;
        a.first();
        a.second();

        D d = new D();

    }
}
