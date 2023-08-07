package com.example.project;

import javafx.scene.layout.VBox;

public class planeController {
    Model model = new Model();
    public void addPlaneModel(String planeName, int capacity, boolean status, VBox all){
        model.addPlane(planeName, capacity, status, all);
    }
    public void removePlaneModel(String planeName, VBox all){
        model.deletePlane(planeName, all);
    }
}
