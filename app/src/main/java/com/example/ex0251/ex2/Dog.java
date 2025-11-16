package com.example.ex0251.ex2;

public class Dog extends Animal implements Runnable{
    @Override
    public void makeSound() {
        System.out.println("Whaf!!");
    }

    @Override
    public void eat() {
        System.out.println("Yummy food for dog!");
    }

    @Override
    public void run() {
        System.out.println("The dog is run!!");
    }
}
