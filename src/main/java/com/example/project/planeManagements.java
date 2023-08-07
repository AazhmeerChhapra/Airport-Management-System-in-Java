package com.example.project;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class planeManagements {

    static ArrayList<plane> planes = new ArrayList<>();
    ArrayList<hanger> hangers = new ArrayList<>();
    ArrayList<runaway> runaways = new ArrayList<>();

    public static ArrayList<plane> getPlane() {
        return planes;
    }

    public void addPlane(String planeName, int capacity, boolean status, VBox all){
//        all.getChildren().clear();
        planes.add(new plane(planeName, capacity, status));
//        printPlanes(all);

    }
    public void deletePlane(String PlaneName,VBox all) {
        all.getChildren().clear();
        for (int i = 0; i < planes.size(); i++) {


            if (planes.get(i).getPlaneName().equals(PlaneName)) {
                planes.remove(i);
                break;
            }

        }


    }

    public ArrayList<plane> getPlanes() {
        return planes;
    }





    private void printPlanes(VBox all){
        for (plane plane: planes){
            String s = "Plane "+plane.planeName+" : isAvailable : "+plane.status+", :Capacity : "+ plane.capacity;
            Label planeLabel = new Label(s);

            all.getChildren().add(planeLabel);

        }
    }

}
