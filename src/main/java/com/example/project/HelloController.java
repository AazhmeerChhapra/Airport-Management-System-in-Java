package com.example.project;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class HelloController {

    @FXML public VBox mainContainer;
    @FXML
    protected void selectionClicked(MouseEvent e) throws IOException {
        switch (((Button) e.getSource()).getId()) {
            case "passenger" -> {
                Platform.runLater(() -> {
                    mainContainer.getChildren().clear();
                    try {
                        mainContainer.getChildren().add(new FXMLLoader(view.class.getResource("passengerManagement.fxml")).load());
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });
            }
            case "plane" -> {
                Platform.runLater(() -> {
                    mainContainer.getChildren().clear();
                    try {
                        mainContainer.getChildren().add(new FXMLLoader(view.class.getResource("planeManagement.fxml")).load());
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });
            }
            case "flight" -> {
                Platform.runLater(() -> {
                    mainContainer.getChildren().clear();
                    try {
                        mainContainer.getChildren().add(new FXMLLoader(view.class.getResource("flightManagement.fxml")).load());
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });
            }
        }
    }
    @FXML
    protected void selectionHovered() {

    }
    @FXML
    protected void selectionExited() {

    }
}