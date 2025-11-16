package com.example.ex0251.ex1;

public class Bicycle extends Vehicle{
    @Override
    public void accelerate() {
        System.out.println("The bicycle accelerated!!!");
    }

    @Override
    public void start() {
        System.out.println("The bicycle started!!!");
    }

    @Override
    public void stop() {
        System.out.println("The bicycle stopped!!!");
    }
}
