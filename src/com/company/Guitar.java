package com.company;

public class Guitar extends Tool{

    private int strings;

    public Guitar(int strings) {
        if (strings < 2) {
            System.out.println("Меньше двух струн нельзя! Присвоено - 2");
            this.strings = 2;
        } else {
            this.strings = strings;
        }
    }

    @Override
    void play() {
        System.out.println("Играет гитара, с " + strings + " струнами");
    }
}
