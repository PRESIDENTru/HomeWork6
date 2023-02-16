package com.company;

public class CounterStrike implements ComputerGame {

    @Override
    public void shoot() {
        System.out.println("Fire!");
    }

    @Override
    public void move() {
        System.out.println("Вы двигаетесь вперед!");
    }

    @Override
    public void start() {
        System.out.println("----------SHOT----------");
    }

    @Override
    public Boolean end() {
        System.out.println("------------------------");
        return true;
    }
}
