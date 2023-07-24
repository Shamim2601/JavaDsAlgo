package SolarSystem;

import java.util.ArrayList;

public class Planet {
    private String Name;
    private double Radius;

    private ArrayList<Satellite> Satellites;

    public Planet(){
        Satellites = new ArrayList<Satellite>();
    }

    public Planet(String name) {
        Satellites = new ArrayList<Satellite>();
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        if(name.length()>2)  Name = name;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }

    public ArrayList<Satellite> getSatellites(){
        return Satellites;
    }

    public void addSatellite(Satellite sat){
        Satellites.add(sat);
    }
}
