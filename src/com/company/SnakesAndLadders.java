package com.company;


public class SnakesAndLadders implements TableGame{


    @Override
    public void start() {
        System.out.println("----------CUB----------");
    }

    @Override
    public Boolean end() {
        System.out.println("-----------------------");
        return true;
    }

    @Override
    public void rollDice() {
        int cub = (int) (Math.random() * 6 + 1);
        System.out.println("Выпала - " + cub);
    }
}
