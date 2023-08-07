package com.example.project;

import javafx.scene.layout.VBox;

public class passengerController {
    Model mod = new Model();
    public void modelCallingAdd(int passengerId,String name, String surname, String passengerType, String luggage, String dateOfBirth, VBox all){
        mod.addPassenger(passengerId,name, surname, passengerType, luggage, dateOfBirth, all);
    }
    public void modelCallingRemove(String name, VBox all){
        mod.removePassenger(name, all);
    }
    public void modelCallingUpdate(String name, String surname, String passType, String luggageCount, String dateOfBirth, VBox all){
        mod.updatePassenger(name,surname, passType,luggageCount, dateOfBirth, all);
    }
}
