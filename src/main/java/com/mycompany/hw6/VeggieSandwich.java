package com.mycompany.hw6;

public class VeggieSandwich extends Sandwitch_template {

    String veggiesused[] = {"tomata", "onion", "potato"};
    boolean custWantCheese(){return false;}

    @Override
    void addVegetables() {
        System.out.println("Adding the Vegetables");
        for (String v : veggiesused) {
            System.out.println("Added : "+ v);
        }
    }

    @Override
    void addCheese() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
