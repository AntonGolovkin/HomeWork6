package ru.geekbrains.homework6;

import java.util.concurrent.Callable;

public class MainApp {
    public static void main(String[] args) {
      Cat cat = new Cat("Пушок");
      Dog dog = new Dog("Бобик");

      cat.run(50);
      cat.swim(5);
      dog.run(150);
      dog.swim(4);

    }
}
