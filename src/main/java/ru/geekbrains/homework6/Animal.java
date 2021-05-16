package ru.geekbrains.homework6;

public abstract class Animal {
    String name;
    int maxSwimDistance;
    int maxRunDistance;


    public void run(int distance){
        if (distance < maxRunDistance) {
            System.out.println(name + " Пробежал");
        } else {
            System.out.println(name + " Не пробежал");
        }
    }

    public void swim(int distance){
        if (maxSwimDistance == 0){
            System.out.println(name + " Не умеет плавать");
            return;
        }
        if (distance < maxSwimDistance) {
            System.out.println(name + " Проплыл");
        } else {
            System.out.println(name + " Не проплыл");
        }
    }

}
