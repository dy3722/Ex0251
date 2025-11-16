package com.example.ex0251.ex1;

public class Car extends Vehicle{
    @Override
    public void accelerate() {
        System.out.println("The car accelerated!!!");
    }

    @Override
    public void start() {
        System.out.println("The car started!!!");
    }

    @Override
    public void stop() {
        System.out.println("The car stopped!!!");
    }
}
