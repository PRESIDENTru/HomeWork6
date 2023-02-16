package com.company;

public class Drum extends Tool{

    private int size;

    public Drum(int size) {
        this.size = size;
    }

    @Override
    void play() {
        System.out.println("Играет барабан размером " + size + "x" + size + " см");
    }
}
