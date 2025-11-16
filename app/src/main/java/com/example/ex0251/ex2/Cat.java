package com.example.ex0251.ex2;

public class Cat extends Animal implements Runnable{
    @Override
    public void makeSound() {
        System.out.println("Meow!!");
    }

    @Override
    public void eat() {
        System.out.println("Yummy food for cat!");
    }

    @Override
    public void run() {
        System.out.println("The cat is run!!");
    }
}
