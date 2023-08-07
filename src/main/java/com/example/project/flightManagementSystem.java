package com.example.project;

import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class flightManagementSystem {
    static ArrayList<flight> flights = new ArrayList<>();

    public void addFlight(String departure, String landing, String departureDate, String returnDate) {
        flights.add(new flight(departure, landing, departureDate, returnDate));

    }

    public static ArrayList<flight> getFlights() {
        return flights;
    }

    public void removefLight(String departure, String landing, String departureDate, String returnDate, VBox all) {
        all.getChildren().clear();
        for (int i = 0; i < flights.size(); i++) {


            if (flights.get(i).getDeparture().equals(departure) && flights.get(i).getLanding().equals(landing) && flights.get(i).getDepartureDate().equals(departureDate) && flights.get(i).getReturnDate().equals(returnDate)) {
                flights.remove(i);
                break;
            }
        }
    }
}
