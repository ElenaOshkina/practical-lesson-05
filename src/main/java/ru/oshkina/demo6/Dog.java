package ru.oshkina.demo6;

import ru.oshkina.demo2.D;

public class Dog {
    private String name;
    private int age;
    private static int count;

    {
        name = "шарик";
        age = 2;
        System.out.println("Это нестатический блок");
    }

    static {
        count = 4;
        System.out.println("Это статический блок");
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Dog dog = new Dog("шарик 2", 8);
        System.out.println(dog);
    }
}
