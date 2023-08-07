package com.example.project;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class flightView {
    @FXML
    VBox currentFlights;
    @FXML
    TextField departure;
    @FXML
    TextField landing;
    @FXML
    TextField departureDate;
    @FXML
    TextField rerurnDate;
    @FXML
    Button addFlight;
    @FXML
    VBox manageTicketsContainer;
    @FXML
    Text ticketPrice;
    @FXML
    TextField passengerIdContainer;
    @FXML
    Button buyTicket;
    @FXML
    Button cancelTicket;

    Controller con =  new Controller();
    String clickedFlight;
    ArrayList<flight> flights = flightManagementSystem.getFlights();

    private void addInPlaneManagement(String buttonText, String buttonValue) {
        Button temp = new Button(buttonText);
        temp.setStyle("-fx-background-color: #fff");
        temp.setId(buttonValue);
        currentFlights.getChildren().add(temp);


        temp.setOnAction((e) -> {
            clickedFlight =  ((Button)e.getSource()).getId();
            String[] flightAttributes = clickedFlight.split(" to | on date | and return on ");
            String[] flighText = flightAttributes[0].split(" ");
            String departures = flighText[1];
            String landings= flightAttributes[1];
            String departureDates = flightAttributes[2];
            String returnDates = flightAttributes[3];
            departure.setText(departures);
            landing.setText(landings);
            departureDate.setText(departureDates);
            rerurnDate.setText(returnDates);
        });
    }

    @FXML
    protected void handleAddFlight(){
        String departures= departure.getText();
        String landings = landing.getText();
        String departureDates = departureDate.getText();
        String returnDate = rerurnDate.getText();
        if (!departures.matches("[a-zA-Z]+") || !landings.matches("[a-zA-Z]+")) {
            // Departure input contains numeric characters, show an error dialog
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Departure or Landings are invalid");

            alert.showAndWait();
        }
        else {
            con.callingFlightAdd(departures, landings, departureDates, returnDate);
            addInPlaneManagement("flight " + departures + " to " + landings + " on date " + departureDates + " and return on " + returnDate, "flight " + departures + " to " + landings + " on date " + departureDates + " and return on " + returnDate);
            con.callingSetSeats(manageTicketsContainer);
        }
    }
    @FXML
    protected void handleRemoveFlight(){
        String[] flightAttributes = clickedFlight.split(" to | on date | and return on ");
        String[] flighText = flightAttributes[0].split(" ");
        String departures = flighText[1];
        String landings= flightAttributes[1];
        String departureDates = flightAttributes[2];
        String returnDates = flightAttributes[3];
        con.callingFlightRemove(departures, landings, departureDates, returnDates, currentFlights);
        for (flight flight:flights){
            String s = "flight " + flight.departure + " to " + flight.landing + " on date " + flight.departureDate + " and return on " + flight.returnDate;
            addInPlaneManagement(s,s);
        }
    }
    @FXML
    protected void handleBuyTicket(){
        manageTicketsContainer.getChildren().clear();
        int passengerID = Integer.parseInt(passengerIdContainer.getText());
        int price = con.callingSetPrice(passengerID);
        con.callingReserveSeat(passengerID, manageTicketsContainer);
        ticketPrice.setText(String.valueOf(price));
    }

    @FXML
    protected void handleCancelTicket(){
        manageTicketsContainer.getChildren().clear();
        int passengerID = Integer.parseInt(passengerIdContainer.getText());
        con.callingCancelSeat(passengerID, manageTicketsContainer);

    }
}
