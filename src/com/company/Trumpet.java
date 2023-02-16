package com.company;

public class Trumpet extends Tool{

    private int diameter;

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    @Override
    void play() {
        System.out.println("Играет труба с диаметром " + diameter + " см");
    }
}
