package com.example.ex0251.ex2;

public class Bird extends Animal implements Flyable{
    @Override
    public void makeSound() {
        System.out.println("twit!!");
    }

    @Override
    public void eat() {
        System.out.println("Yummy food for bird!");
    }

    @Override
    public void fly() {
        System.out.println("The bird is fly!!");
    }
}
