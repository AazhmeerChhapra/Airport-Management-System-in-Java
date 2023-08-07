package com.example.project;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class view extends  Application  {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(view.class.getResource("main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1100, 800);
        stage.setFullScreen(true);
        stage.setTitle("Airport Management System!");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
       launch();
    }
}