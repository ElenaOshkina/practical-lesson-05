package ru.oshkina.demo3;

public class Demo {
    public static void main(String[] args) {
        //объект создается на основе анониманого класса
//        MyClass a = new MyClass(100) {
//            @Override
//            void show() {
//                System.out.println("объект а: " + code);
//            }
//        };
        MyClass a = new MyClassA(100);

        //объект создается на основе анониманого класса
//        MyClass b = new MyClass(200) {
//            @Override
//            void show() {
//                System.out.println("объект b: " + code);
//            }
//        };

        MyClass b = new MyClassB(200);

        //вызов метода
        a.show();
        b.show();

        //измнение значения поля
        a.code = 150;
        b.code = 250;

        //вызов метода
        a.show();
        b.show();
    }
}
