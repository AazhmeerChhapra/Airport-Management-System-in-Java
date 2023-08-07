package com.example.project;

public class flight {
    public String departure;
    public String landing;
    public String departureDate;
    public String returnDate;

    public flight(String departure, String landing, String departureDate, String returnDate) {
        this.departure = departure;
        this.landing = landing;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getLanding() {
        return landing;
    }

    public void setLanding(String landing) {
        this.landing = landing;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
}
