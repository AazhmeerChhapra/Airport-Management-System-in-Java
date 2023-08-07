package com.example.project;

import javafx.scene.layout.VBox;

public class ticket {
    VIPticket vip = new VIPticket();
    regularTicket reg = new regularTicket();
    businessPassenger bp = new businessPassenger();
    economyPassenger ep = new economyPassenger();
    familyPassenger fp = new familyPassenger();
    public static int price;

    public int setPrice(String passengerType){
        if (passengerType.equalsIgnoreCase("economy")){
            reg.price = ep.price;
            price = reg.price;
        }
        else if (passengerType.equalsIgnoreCase("family")){
            reg.price = fp.price;
            price = reg.price;
        } else if (passengerType.equalsIgnoreCase("business")) {
            vip.price = bp.price;
            price = vip.price;
        }
        return price;
    }

}
