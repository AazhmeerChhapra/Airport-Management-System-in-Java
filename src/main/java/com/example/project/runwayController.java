package com.example.project;

public class runwayController {
    Model model = new Model();
    public void addRunwayModel(int runwayID, int airportID){
        model.addRunway(runwayID, airportID);
    }
    public void deleteRunwayModel(int runwayID, int airportID){
        model.deleteRunway(runwayID,airportID);
    }
    public String reserveRunwayModel(int runwayID, int airportID,String planeDetails){
        return model.reserveRunway(runwayID, airportID, planeDetails);
    }
    public String unreserveRunwayModel(int runwayID, int airportID){
        return model.unreserveRunway(runwayID, airportID);
    }

}
