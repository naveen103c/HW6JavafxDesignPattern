package com.mycompany.hw6;

public abstract class Sandwitch_template {

    final void makeSandwich() {
        cutBurger();

        if (custWantCheese()) {
            addCheese();
        }
        if (custWantVegetables()) {
            addVegetables();
        }
        wrapthesandwich();
    }

    private void cutBurger() {
        System.out.println("The Burger is cut");
    }

    abstract void addCheese();

    abstract void addVegetables();

    boolean custWantCheese() {
        return true;
    }

    boolean custWantVegetables() {
        return true;
    }

    private void wrapthesandwich() {
        System.out.println("The sandwich is wrapped and ready");
        System.out.println("");
    }

}
