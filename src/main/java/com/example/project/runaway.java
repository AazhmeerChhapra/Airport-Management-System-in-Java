package com.example.project;

public class runaway {
    public int runwayID;
    public int airportID;

    public runaway(int runwayID, int airportID) {
        this.runwayID = runwayID;
        this.airportID = airportID;
    }

    public int getRunwayID() {
        return runwayID;
    }

    public void setRunwayID(int runwayID) {
        this.runwayID = runwayID;
    }

    public int getAirportID() {
        return airportID;
    }

    public void setAirportID(int airportID) {
        this.airportID = airportID;
    }
}
