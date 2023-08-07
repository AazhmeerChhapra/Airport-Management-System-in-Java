package com.example.project;

import javafx.scene.layout.VBox;

public class Controller {

    Model model;


        passengerController psg = new passengerController();
        planeController plc = new planeController();
        hangerController hc = new hangerController();
        runwayController rc = new runwayController();
        flightController fc = new flightController();
        public void callingPassengerAdd(int passengerId, String name, String surname, String passengerType, String luggage, String dateOfBirth, VBox all) {
            psg.modelCallingAdd(passengerId,name, surname, passengerType, luggage, dateOfBirth, all);
        }
        public void callingPassengerRemove(String name, VBox all) {
            psg.modelCallingRemove(name, all);
    }
    public void callingPassengerUpdate(String name, String surname, String passType, String luggageCount, String dateOfBirth, VBox all){
        psg.modelCallingUpdate(name,surname, passType,luggageCount, dateOfBirth, all);
    }
    public void callingPlaneAdd(String planeName, int capacity, boolean status, VBox all){
            plc.addPlaneModel(planeName, capacity, status, all);
    }
    public void callingPlaneRemove(String planeName, VBox all){
            plc.removePlaneModel(planeName, all);
    }
    public void callingHangerAdd(int hangerID, int airportID){
            hc.addHangerModel(hangerID, airportID);
    }
    public void CallingDeleteHanger(int hangId, int airportID){
        hc.deleteHangerModel(hangId,airportID);
    }
    public String callingReserveHanger(int hangID, int airportID, String planeDetails){
            return hc.reserveHangerModel(hangID, airportID, planeDetails);
    }
    public String callingUnreserveHanger(int hangID, int airportID){
        return hc.unreserveHangerModel(hangID, airportID);
    }
    public void callingRunwayAdd(int runwayID, int airportID){
        rc.addRunwayModel(runwayID, airportID);
    }
    public void CallingDeleteRunway(int runwayID, int airportID){
        rc.deleteRunwayModel(runwayID,airportID);
    }
    public String callingReserveRunway(int runwayID, int airportID,String planeDetails){
            return rc.reserveRunwayModel(runwayID, airportID, planeDetails);
    }
    public String callingUnreserveRunway(int runwayID, int airportID){
        return rc.unreserveRunwayModel(runwayID, airportID);
    }
    public void callingFlightAdd(String departure, String landing, String departureDate, String returnDate){
            fc.addFlightModel(departure, landing, departureDate, returnDate);
    }
    public void callingFlightRemove(String departure, String landing, String departureDate, String returnDate, VBox all){
            fc.removeFlightModel(departure, landing, departureDate, returnDate, all);
    }
    public void callingSetSeats(VBox all){
            fc.setSeatsModel(all);
    }
    public int callingSetPrice(int passengerID){
            return fc.setPriceModel(passengerID);
    }
    public void callingReserveSeat(int passengerID, VBox all){
            fc.reserveSeatModel(passengerID, all);
    }
    public void callingCancelSeat(int passengerID, VBox all){
            fc.cancelSeatModel(passengerID, all);
    }
    }





