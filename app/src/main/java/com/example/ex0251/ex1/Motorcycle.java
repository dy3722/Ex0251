package com.example.ex0251.ex1;

public class Motorcycle extends Vehicle{
    @Override
    public void accelerate() {
        System.out.println("The motorcycle accelerated!!!");
    }

    @Override
    public void start() {
        System.out.println("The motorcycle started!!!");
    }

    @Override
    public void stop() {
        System.out.println("The motorcycle stopped!!!");
    }
}
