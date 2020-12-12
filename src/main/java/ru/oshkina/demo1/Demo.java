package ru.oshkina.demo1;

public class Demo {
    public static void main(String[] args) {
        //Создание объектов
        Alpha a = new Alpha();
        Bravo b = new Bravo();
        Charlie c = new Charlie();
        //Переменная супкркласса
        Alpha r;
        //переменная ссылается на объект класса Alpha
        r = a;
        r.show();
        //переменная ссылается на объект класса Bravo
        r = b;
        r.show();
        //переменная ссылается на объект класса Charlie
        r = c;
        r.show();
    }
}
