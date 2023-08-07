package com.example.project;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class ticketInterface {
    VIPticket vip = new VIPticket();
    ticket ticket = new ticket();

    ArrayList<Passenger> passengers = passengerManagementSystem.getPassengers();


    String clickedSeat;
    int price = 0;
    int VIPseats = 1;
    int economySeats = 3;
    int familySeats = 2;
    String seats;

    private void addInPlaneManagement(String buttonText, String buttonValue, VBox all) {
        Button temp = new Button(buttonText);
        temp.setStyle("-fx-background-color: #fff");
        temp.setId(buttonValue);
        all.getChildren().add(temp);


        temp.setOnAction((e) -> {
            clickedSeat = ((Button) e.getSource()).getId();
        });
    }

    public void setSeats(VBox all) {
        all.getChildren().clear();
        seats = "VIP Seat : 0 empty \n Seat 1 empty \n Seat 2 empty \n Seat 3 empty \n Seat 4 empty \n Seat 5 empty";
        Label lab = new Label(seats);
        all.getChildren().add(lab);
    }

    public int setPrice(int passengerID) {
        for (int i = 0; i < passengers.size(); i++) {
            if (passengers.get(i).getPassengerId() == passengerID) {
                String passType = passengers.get(i).getPassengerType();
                price = ticket.setPrice(passType);
                break;
            } else {
                System.out.println("Not found");
            }
        }
        return price;
    }

    public void reserveSeat(int passengerID, VBox all) {
        for (int i = 0; i < passengers.size(); i++) {
            if (passengers.get(i).getPassengerId() == passengerID) {
                String passType = passengers.get(i).getPassengerType();
                if (passType.equalsIgnoreCase("business")) {
                    if (VIPseats <= 0) {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Error");
                        alert.setHeaderText(null);
                        alert.setContentText("No Seats available");
                        alert.showAndWait();
                        Label lab = new Label(seats);
                        all.getChildren().add(lab);
                    } else {
                        VIPseats--;
                        seats = seats.replace("VIP Seat : 0 empty", "VIP Seat : 0 " + passengers.get(i).getName() + " " + passengers.get(i).getSurname());
                        System.out.println(seats);
                        Label lab = new Label(seats);
                        all.getChildren().add(lab);

                    }
                }
                if (passType.equalsIgnoreCase("economy")) {
                    if (economySeats <= 0) {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Error");
                        alert.setHeaderText(null);
                        alert.setContentText("No Seats available");
                        alert.showAndWait();
                        Label lab = new Label(seats);
                        all.getChildren().add(lab);
                    } else if (economySeats == 3) {
                        economySeats--;
                        all.getChildren().clear();
                        seats = seats.replace("Seat 1 empty", "Seat 1 " + passengers.get(i).getName() + " " + passengers.get(i).getSurname());
                        Label lab = new Label(seats);
                        all.getChildren().add(lab);
                    } else if (economySeats == 2) {
                        economySeats--;
                        all.getChildren().clear();
                        seats = seats.replace("Seat 2 empty", "Seat 2 " + passengers.get(i).getName() + " " + passengers.get(i).getSurname());
                        Label lab = new Label(seats);
                        all.getChildren().add(lab);
                    } else if (economySeats == 1) {
                        economySeats--;
                        all.getChildren().clear();
                        seats = seats.replace("Seat 3 empty", "Seat 3 " + passengers.get(i).getName() + " " + passengers.get(i).getSurname());
                        Label lab = new Label(seats);
                        all.getChildren().add(lab);
                    }

                }
                if (passType.equalsIgnoreCase("family")) {
                    if (familySeats <= 0) {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("Error");
                        alert.setHeaderText(null);
                        alert.setContentText("No Seats available");
                        alert.showAndWait();
                        Label lab = new Label(seats);
                        all.getChildren().add(lab);
                    } else if (familySeats == 2) {
                        familySeats--;
                        seats = seats.replace("Seat 4 empty", "Seat 4 " + passengers.get(i).getName() + " " + passengers.get(i).getSurname());
                        Label lab = new Label(seats);
                        all.getChildren().add(lab);
                    } else if (familySeats == 1) {
                        familySeats--;
                        seats = seats.replace("Seat 5 empty", "Seat 5 " + passengers.get(i).getName() + " " + passengers.get(i).getSurname());
                        Label lab = new Label(seats);
                        all.getChildren().add(lab);
                    }
                }
            }
        }

    }

    public void cancelSeat(int passengerID, VBox all) {
        for (int i = 0; i < passengers.size(); i++) {
            if (passengers.get(i).getPassengerId() == passengerID) {
                String name = passengers.get(i).getName();
                String surname = passengers.get(i).getSurname();
                if (passengers.get(i).getPassengerType().equalsIgnoreCase("business")){
                    VIPseats++;
                } else if (passengers.get(i).getPassengerType().equalsIgnoreCase("economy")) {
                    economySeats++;
                }
                else if(passengers.get(i).getPassengerType().equalsIgnoreCase("family")){
                    familySeats++;
                }
                seats = seats.replace(name+" "+surname, "empty");
                Label lab = new Label(seats);
                all.getChildren().add(lab);

            }
            else{
                System.out.println("Wrong ID");
            }
        }

    }
}
