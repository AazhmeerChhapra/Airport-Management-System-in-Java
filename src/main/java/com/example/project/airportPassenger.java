package com.example.project;

import javafx.scene.layout.VBox;

public class airportPassenger {
    passengerManagementSystem pms = new passengerManagementSystem();

    public void createPassenger(int passengerid,String name, String surname, String passType, String luggageCount, String dateOfBirth, VBox all ){
        pms.createPassenger(passengerid, name, surname, passType, luggageCount, dateOfBirth, all);
    }
    public void deletePassenger(String name,VBox all){
        pms.deletePassenger(name, all);
    }
    public void updatePassenger(String name, String surname, String passType, String luggageCount, String dateOfBirth, VBox all){
        pms.updatePassenger(name, surname, passType, luggageCount, dateOfBirth, all);
    }
}
