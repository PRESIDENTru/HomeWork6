package com.company;

public class Home {

    public static void main(String[] args) {
        SnakesAndLadders snake = new SnakesAndLadders();
        ComputerGame counter = new CounterStrike();

        snake.start();
        snake.rollDice();
        snake.end();
        System.out.println();
        counter.start();
        counter.shoot();
        counter.move();
        counter.end();
    }
}
