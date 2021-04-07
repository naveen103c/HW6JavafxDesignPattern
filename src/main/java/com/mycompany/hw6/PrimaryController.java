package com.mycompany.hw6;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class PrimaryController {

    @FXML
    Button reg_sandwich;
    @FXML
    Button cheese_sandwich;
    @FXML
    Button veggie_sandwich;
    @FXML
    TextArea textoutput;
    String Output = "";

    @FXML
    private void reg_sandwich() throws IOException {
        Output = "";
        Sandwitch_template cust1 = new RegularSandwich();
        cust1.makeSandwich();
        textoutput.setText(Output);
    }

    @FXML
    private void veggie_sandwich() throws IOException {
         Output = "";
        Sandwitch_template cust2 = new VeggieSandwich();
        cust2.makeSandwich();
          textoutput.setText(Output);
    }

    @FXML
    private void cheese_sandwich() throws IOException {
        
         Output = "";Sandwitch_template cust3 = new CheeseSandwich();
        cust3.makeSandwich();
           textoutput.setText(Output);
    }

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
            Output += "The Burger is cut\n";
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
            Output += "The sandwich is wrapped and ready\n";
            //textoutput.appendText("The sandwich is wrapped and ready\n");
        }
    }

    public class RegularSandwich extends Sandwitch_template {

        String cheeseused[] = {"Cheese Cubes"};
        String veggiesused[] = {"tomata", "onion", "potato"};

        @Override
        void addCheese() {
            Output += "Adding the Cheese\n";
            for (String c : cheeseused) {
                Output += "Added : " + c + "\n";
            }
        }

        @Override
        void addVegetables() {
            Output += "Adding the Vegetables\n";
            for (String v : veggiesused) {
                Output += "Added : " + v + "\n";
            }
        }
    }

    public class VeggieSandwich extends Sandwitch_template {

        String veggiesused[] = {"tomata", "onion", "potato"};

        boolean custWantCheese() {
            return false;
        }

        @Override
        void addVegetables() {
            Output += "Adding the Vegetables\n";
            for (String v : veggiesused) {
                Output += "Added : " + v + "\n";
            }
        }

        @Override
        void addCheese() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    public class CheeseSandwich extends Sandwitch_template {

        String cheeseused[] = {"Cheese Cubes"};

        boolean custWantVegetables() {
            return false;
        }

        @Override
        void addCheese() {
            Output += "Adding the Cheese\n";
            for (String c : cheeseused) {
                Output += "Added : " + c + "\n";
            }
        }

        @Override
        void addVegetables() {
        }
    }
}
