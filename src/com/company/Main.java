package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Tool> tools = new ArrayList<>();
        tools.add(new Guitar(5));
        tools.add(new Drum(45));
        tools.add(new Trumpet(60));


        Iterator<Tool> it = tools.iterator();

        while (it.hasNext()) {
            Tool n = it.next();
            n.play();
        }
    }
}
