package com.mycompany.hw6;

public class RegularSandwich extends Sandwitch_template {

    String cheeseused[] = {"Cheese Cubes"};
    String veggiesused[] = {"tomata", "onion", "potato"};

    @Override
    void addCheese() {
        System.out.println("Adding the Cheese");
        for (String c : cheeseused) {
            System.out.println("Added : " + c);
        }
    }

    @Override
    void addVegetables() {
        System.out.println("Adding the Vegetables");
        for (String v : veggiesused) {
            System.out.println("Added : " + v);
        }
    }
}
