package com.example.project;

public class Passenger {
    int passengerId;
    String name;
    String surname;
    String passengerType;
    String luggageCount;
    String dateOfBirth;

    public Passenger(int passengerId,String name, String surname, String passengerType, String luggageCount, String dateOfBirth) {
        this.passengerId = passengerId;
        this.name = name;
        this.surname = surname;
        this.passengerType = passengerType;
        this.luggageCount = luggageCount;
        this.dateOfBirth = dateOfBirth;
    }
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", passengerType='" + passengerType + '\'' +
                ", luggageCount=" + luggageCount +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(String passengerType) {
        this.passengerType = passengerType;
    }

    public String getLuggageCount() {
        return luggageCount;
    }

    public void setLuggageCount(String luggageCount) {
        this.luggageCount = luggageCount;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}