package com.mycompany.hw6;

public class CheeseSandwich extends Sandwitch_template {

    String cheeseused[] = {"Cheese Cubes"};
    boolean custWantVegetables(){return false;}
    
    @Override
    void addCheese() {
        System.out.println("Adding the Cheese");
        for (String c : cheeseused) {
            System.out.println("Added : " + c);
        }
    }

    @Override
    void addVegetables() {        
    }

    
}
