package com.example.project;

public class hangerController {
    Model model = new Model();

    public void addHangerModel(int hangerID, int airportID){
        model.addHanger(hangerID, airportID);
    }
    public void deleteHangerModel(int hangId, int airportID){
        model.deleteHanger(hangId,airportID);
    }
    public String reserveHangerModel(int hangID, int airportID, String planeDetails){
        return model.reserveHanger(hangID, airportID, planeDetails);
    }
    public String unreserveHangerModel(int hangID, int airportID){
        return model.unreserveHanger(hangID, airportID);
    }
}
