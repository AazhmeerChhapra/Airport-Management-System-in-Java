package com.example.project;

public class hanger {
    public int hangerID;
    public int airportID;

    public hanger(int hangerID, int airportID) {
        this.hangerID = hangerID;
        this.airportID = airportID;
    }

    public int getHangerID() {
        return hangerID;
    }

    public void setHangerID(int hangerID) {
        this.hangerID = hangerID;
    }

    public int getAirportID() {
        return airportID;
    }

    public void setAirportID(int airportID) {
        this.airportID = airportID;
    }

    @Override
    public String toString() {
        return "hanger{" +
                "hangerID=" + hangerID +
                ", airportID=" + airportID +
                '}';
    }
}
