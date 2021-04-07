package com.mycompany.hw6;
public class Sandwich {
    public static void main(String[] args) {
        Sandwitch_template cust1=new RegularSandwich();
        cust1.makeSandwich();
        Sandwitch_template cust2=new VeggieSandwich();
        cust1.makeSandwich();
        Sandwitch_template cust3=new CheeseSandwich();
        cust1.makeSandwich();
    }
    
}
