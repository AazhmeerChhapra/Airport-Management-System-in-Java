package com.example.project;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.List;

public class passengerManagementSystem {
    static ArrayList<Passenger> passengers = new ArrayList<>();

    public static ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public passengerManagementSystem() {

    }

    public void createPassenger(int passengerid,String name, String surname, String passType, String luggageCount, String dateOfBirth, VBox all ){
        all.getChildren().clear();
        passengers.add(new Passenger(passengerid, name,surname, passType,luggageCount, dateOfBirth));
        printPassengers(all);
    }
    public void deletePassenger(String name,VBox all) {
        for (int i = 0; i < passengers.size(); i++) {
            System.out.println(passengers.get(i).getName());

            if (passengers.get(i).getName().equals(name)) {
                passengers.remove(i);
                break;
            }
        }
        printPassengers(all);

    }
    public void updatePassenger(String name, String surname, String passType, String luggageCount, String dateOfBirth, VBox all) {
        all.getChildren().clear();

        // Iterate over passengers list and add details to VBox
        for (int i = 0; i < passengers.size(); i++) {

            if (passengers.get(i).getName().equals(name)) {
                passengers.get(i).setName(name);
                passengers.get(i).setSurname(surname);
                passengers.get(i).setPassengerType(passType);
                passengers.get(i).setLuggageCount(luggageCount);
                passengers.get(i).setDateOfBirth(dateOfBirth);
                break;
            }

        }
        printPassengers(all);
    }
    private void printPassengers(VBox all) {
        for (Passenger passenger : passengers) {
            Label passengers = new Label( passenger.passengerType+" passenger: "+passenger.passengerId+": "+passenger.name+" "+passenger.surname+" "+passenger.dateOfBirth );

            all.getChildren().add(passengers);
        }
    }
}
