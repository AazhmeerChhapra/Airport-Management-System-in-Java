package com.example.project;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class planeView {
    Controller con = new Controller();
    @FXML
    VBox planeManagement;
    @FXML
    TextField addPlaneText;
    @FXML
    Button addPlane;
    @FXML
    TextField capacity;
    @FXML
    Button plusSign;
    @FXML
    Button minusSign;
    @FXML
    TextField removePlaneTextField;
    @FXML
    Button removePlane;
    @FXML
    TextField airportfield1;

    @FXML
    TextField airportfield2;
    @FXML
    TextField airportfield3;

    @FXML
    TextField airportfield4;

    @FXML
    Button addHanger;
    @FXML
    Button addrunway;
    @FXML
    Button reserveHanger;
    @FXML
    Button reserveRunway;
    @FXML
    Button removeRunway;
    @FXML
    Button removeHanger;
    @FXML
    Button resetRunway;
    @FXML
    Button resetHanger;

String clickedFlight;
    ArrayList<plane> planes = planeManagements.getPlane();

    private void addInPlaneManagement(String buttonText, String buttonValue) {
        Button temp = new Button(buttonText);
        temp.setStyle("-fx-background-color: #fff");
        temp.setId(buttonValue);
        planeManagement.getChildren().add(temp);


        temp.setOnAction((e) -> {
            clickedFlight =  ((Button)e.getSource()).getId();
        });
    }
    int capac=0;

    String planeName;
    boolean status = true;



    @FXML
    protected void handleAddPlane(){

        if (capac>0){
            planeName = addPlaneText.getText();


            con.callingPlaneAdd(planeName, capac, status,planeManagement);
            addInPlaneManagement("Plane "+planeName+" : isAvailable : "+status+", :Capacity : "+capac+"\n", "Plane "+planeName+" : isAvailable : "+status+", :Capacity : "+capac);
        }
        else {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Capacity error ");
            alert.setHeaderText(null);
            alert.setContentText("Capacity must be greater than 0");

            alert.showAndWait();

        }
    }
    @FXML
    protected void handlePlusSign(){
        capac++;
        if (capac>0) {
            capacity.setText(String.valueOf(capac));
        }
    }
    @FXML
    protected void handleMinusSign(){
        capac--;
        if (capac>=0) {
            capacity.setText(String.valueOf(capac));
        }
    }
    @FXML
    protected void handleRemovePlaneComboBox(){}
    @FXML
    protected void handleRemovePlane(){
        planeName = removePlaneTextField.getText();
        con.callingPlaneRemove(planeName, planeManagement);
        for (plane plane:planes){
            String s = "Plane "+plane.planeName+" : isAvailable : "+plane.status+", :Capacity : "+plane.capacity;
            addInPlaneManagement(s,s);
        }

    }
    @FXML
    protected void handleAddHanger(){
        String airport = airportfield1.getText();
        String hangId = airportfield2.getText();
        con.callingHangerAdd(Integer.parseInt(hangId), Integer.parseInt(airport));

    }
    @FXML
    protected void handleAddrunway(){
        String airportID = airportfield1.getText();
        String runwayID = airportfield2.getText();
        con.callingRunwayAdd(Integer.parseInt(runwayID), Integer.parseInt(airportID));
    }
    @FXML
    protected void handleReserveRunway(){
        String airportID = airportfield1.getText();
        String runwayID = airportfield2.getText();
        String resRun = con.callingReserveRunway(Integer.parseInt(runwayID), Integer.parseInt(airportID), clickedFlight);
        airportfield4.setText(resRun);
        airportfield4.setEditable(false);
    }
    @FXML
    protected void handleReserveHanger(){
        String airportID = airportfield1.getText();
        String hangId = airportfield2.getText();
        String resHan = con.callingReserveHanger(Integer.parseInt(hangId), Integer.parseInt(airportID), clickedFlight);
        airportfield3.setText(resHan);
        airportfield3.setEditable(false);

    }
    @FXML
    protected void handleRemoveHanger(){
        String airport = airportfield1.getText();
        String hangId = airportfield2.getText();
        con.CallingDeleteHanger(Integer.parseInt(hangId),Integer.parseInt(airport));


    }

    @FXML
    protected void handleResetRunway(){
        String airportID = airportfield1.getText();
        String runwayID = airportfield2.getText();
        String resRun = con.callingUnreserveRunway(Integer.parseInt(runwayID), Integer.parseInt(airportID));
        airportfield4.setText(resRun);
        airportfield4.setEditable(false);
    }
    @FXML
    protected void handleResetHanger(){
        String airportID = airportfield1.getText();
        String hangId = airportfield2.getText();
        String resHan = con.callingUnreserveHanger(Integer.parseInt(hangId), Integer.parseInt(airportID));
        airportfield3.setText(resHan);
        airportfield3.setEditable(false);
    }
    @FXML
    protected void handleRemoveRunway(){
        String airportID = airportfield1.getText();
        String runwayID = airportfield2.getText();
        con.CallingDeleteRunway(Integer.parseInt(runwayID), Integer.parseInt(airportID));

    }



}
