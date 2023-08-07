package com.example.project;

import javafx.scene.layout.VBox;

public class Model{
    passengerManagementSystem pm = new passengerManagementSystem();
    airportPassenger ap = new airportPassenger();
    planeManagements plm = new planeManagements();
    airportManagementSystem ams = new airportManagementSystem();
    flightManagementSystem fms = new flightManagementSystem();
    ticketInterface tin = new ticketInterface();
    public void addPassenger(int passengerId,String name, String surname, String passengerType, String luggage, String dateOfBirth, VBox all){

        ap.createPassenger(passengerId, name, surname, passengerType, luggage, dateOfBirth, all);

    }
    public void removePassenger(String name,  VBox all){

        ap.deletePassenger(name, all);

    }
    public void updatePassenger(String name, String surname, String passType, String luggageCount, String dateOfBirth, VBox all){
        ap.updatePassenger(name,surname, passType,luggageCount, dateOfBirth, all);
    }
    public void addPlane(String planeName, int capacity, boolean status, VBox all){
        plm.addPlane(planeName, capacity, status, all);
    }
    public void deletePlane(String planeName, VBox all){
        plm.deletePlane(planeName, all);
    }
    public void addHanger(int hangerID, int airportID){
        ams.addHangers(hangerID, airportID);
    }
    public void deleteHanger(int hangId, int airportID){
        ams.deleteHangers(hangId,airportID);
    }
    public void addRunway(int runwayID, int airportID){
        ams.addRunway(runwayID, airportID);
    }
    public void deleteRunway(int runwayID, int airportID){
        ams.deleteRunway(runwayID,airportID);
    }
    public String reserveHanger(int hangID, int airportID, String planeDetails){
        return ams.hangerReserve(hangID, airportID, planeDetails);
    }
    public String unreserveHanger(int hangID, int airportID){
        return ams.hangerUnreserve(hangID, airportID);
    }
    public String reserveRunway(int runwayID, int airportID,String planeDetails ){
        return ams.runwayReserve(runwayID, airportID, planeDetails);
    }
    public String unreserveRunway(int runwayID, int airportID ){
        return ams.runwayUneserve(runwayID, airportID);
    }
    public void addFlight(String departure, String landing, String departureDate, String returnDate){
        fms.addFlight(departure, landing, departureDate, returnDate);
    }
    public void removeFlight(String departure, String landing, String departureDate, String returnDate, VBox all){
        fms.removefLight(departure, landing, departureDate, returnDate, all);
    }

    public void setSeats(VBox all){
        tin.setSeats(all);
    }
    public int setPrice(int passengerID){
        return tin.setPrice(passengerID);
    }
    public void reserveSeat(int passengerID, VBox all){
        tin.reserveSeat(passengerID, all);
    }
    public void cancelSeat(int passengerID, VBox all){
        tin.cancelSeat(passengerID, all);
    }

}
