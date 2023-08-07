package com.example.project;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

import java.time.LocalDate;

public class passengerView {

    @FXML
    VBox allPasangers;
    @FXML
    TextField name;
    @FXML
    TextField surname;
    Controller con = new Controller();

    @FXML
    TextField passengertype;
    @FXML
    ComboBox passengerTypeComboBox;
    @FXML
    TextField luggageCount;
    @FXML
    TextField dateOfBirth;
    @FXML
    Button addUser;
    @FXML
    Button removeUser;
    @FXML
    Button updateUser;

    int passengerId = 0;
    String namess;
    String surnames;
    String passTypes;
    String lug;
    String dob;

    @FXML
    protected void initialize() {
        // Pre-define the values for passengerTypeComboBox
        passengerTypeComboBox.getItems().addAll("Business","Economy","Family" );

        // Set default selection
        passengerTypeComboBox.getSelectionModel().selectFirst();
        passengerTypeComboBox.setEditable(false);
    }

    @FXML
    protected void handlePassengerTypeComboBox() {

    }
    @FXML
    protected void handleAddUser() {
        String passType = (String) passengerTypeComboBox.getSelectionModel().getSelectedItem();
//        passengerManagementSystem psm = new passengerManagementSystem();

        namess = name.getText();
        surnames = surname.getText();
        passTypes = passType;
        lug = luggageCount.getText();
        dob = dateOfBirth.getText();
        if (isValidDateOfBirth(dob) && isValidLuggageCount(lug)) {
//        allPasangers.getChildren().clear();
            con.callingPassengerAdd(passengerId,name.getText(), surname.getText(), passType, luggageCount.getText(), dateOfBirth.getText(), allPasangers);
            passengerId++;
        }
        else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Invalid Date of Birth or luggage ");
            alert.setHeaderText(null);
            alert.setContentText("Please enter a valid date of birth or luggage");

            alert.showAndWait();
        }

    }
    @FXML
    protected void handleRemoveUser() {
        String passType = (String) passengerTypeComboBox.getSelectionModel().getSelectedItem();
//        passengerManagementSystem psm = new passengerManagementSystem();
        namess = name.getText();
        surnames = surname.getText();
        passTypes = passType;
        lug = luggageCount.getText();
        dob = dateOfBirth.getText();
        allPasangers.getChildren().clear();
        con.callingPassengerRemove(name.getText(), allPasangers);
    }
    @FXML
    protected void handleUpdateUser() {
        String passType = (String) passengerTypeComboBox.getSelectionModel().getSelectedItem();
//        passengerManagementSystem psm = new passengerManagementSystem();

        namess = name.getText();
        surnames = surname.getText();
        passTypes = passType;
        lug = luggageCount.getText();
        dob = dateOfBirth.getText();
//        allPasangers.getChildren().clear();
        con.callingPassengerUpdate(name.getText(), surname.getText(), passType, luggageCount.getText(), dateOfBirth.getText(), allPasangers);
    }
    public String toString() {
        return "Passenger{" +
                "name='" + namess + '\'' +
                ", surname='" + surnames + '\'' +
                ", passengerType='" + passTypes + '\'' +
                ", luggageCount=" + lug +
                ", dateOfBirth='" + dob + '\'' +
                '}';
    }
    public static boolean isValidDateOfBirth(String dateOfBirth) {
        try {
            int year = Integer.parseInt(dateOfBirth);
            int currentYear = LocalDate.now().getYear();

            // Check if the year is within a valid range
            if (year >= 1900 && year <= currentYear) {
                return true;
            }

            return false;
        } catch (NumberFormatException e) {
            // Invalid number format
            return false;
        }
    }
    public static boolean isValidLuggageCount(String luggageCount) {
        try {
            int count = Integer.parseInt(luggageCount);

            // Check if the luggage count is within a valid range
            if (count >= 0 && count <= 10) {
                return true;
            }

            return false;
        } catch (NumberFormatException e) {
            // Invalid number format
            return false;
        }
    }





}
