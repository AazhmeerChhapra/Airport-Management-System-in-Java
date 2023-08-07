package com.example.project;

import java.util.ArrayList;

public class airportManagementSystem {
    ArrayList<hanger> hangers = new ArrayList<>();
    ArrayList<runaway> runaways = new ArrayList<>();

    public void addHangers(int hangerID, int airportID){
        hangers.add(new hanger(hangerID, airportID));
        printHangers();
    }
    public void deleteHangers(int hangId, int airportID){
        for (int i=0; i<hangers.size();i++){
            if (hangers.get(i).getHangerID() == hangId  &&hangers.get(i).getAirportID() == airportID){
                hangers.remove(i);
                break;
            }

        }
    }
    private void printHangers(){
        for (hanger hanger: hangers){
            System.out.println(hanger.hangerID+"  "+hanger.airportID);
        }
    }
    public void addRunway(int runwayID, int airportID){
        runaways.add(new runaway(runwayID, airportID));
        printRunway();
    }
    public void deleteRunway(int runwayID, int airportID){
        for (int i=0; i<runaways.size();i++){
            if (runaways.get(i).getRunwayID() == runwayID && runaways.get(i).getAirportID() == airportID){
                runaways.remove(i);
                break;
            }
            else {
                System.out.println("not found");
            }
        }
    }
    private void printRunway(){
        for (runaway runaway: runaways){
            System.out.println(runaway.runwayID+"  "+runaway.airportID);
        }
    }
    public String hangerReserve(int hangID, int airportID, String planeDetails){

        return "Hanger "+hangID+" at airport "+airportID+" is being used by "+planeDetails;
    }
    public String hangerUnreserve(int hangID, int airportID){

        return "Hanger "+hangID+" at airport "+airportID+" is empty";
    }
    public String runwayReserve(int runwayID, int airportID, String planeDetails){

        return "Runway "+runwayID+" at airport "+airportID+" is reserved for "+planeDetails;
    }
    public String runwayUneserve(int runwayID, int airportID){

        return "Runway "+runwayID+" at airport "+airportID+" is empty";
    }
}
