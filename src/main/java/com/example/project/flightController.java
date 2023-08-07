package com.example.project;

import javafx.scene.layout.VBox;

public class flightController {

    Model model = new Model();

    public void addFlightModel(String departure, String landing, String departureDate, String returnDate){
        model.addFlight(departure, landing, departureDate, returnDate);
    }
    public void removeFlightModel(String departure, String landing, String departureDate, String returnDate, VBox all){
        model.removeFlight(departure, landing, departureDate, returnDate, all);
    }
    public void setSeatsModel(VBox all){
        model.setSeats(all);
    }
    public int setPriceModel(int passengerID){
        return model.setPrice(passengerID);
    }
    public void reserveSeatModel(int passengerID, VBox all){
        model.reserveSeat(passengerID, all);
    }
    public void cancelSeatModel(int passengerID, VBox all){
        model.cancelSeat(passengerID, all);
    }
}
