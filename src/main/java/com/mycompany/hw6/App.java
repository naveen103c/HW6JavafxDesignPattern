package com.mycompany.hw6;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage1) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("primary.fxml"));
            Scene scene = new Scene(root);
            stage1.setScene(scene);
            stage1.setTitle("Template Design Pattern");
            stage1.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
