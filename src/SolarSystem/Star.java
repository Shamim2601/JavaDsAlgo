package SolarSystem;

import java.util.ArrayList;

public class Star{
    private String Name;
    private double Radius;

    private ArrayList<Planet> Planets;

    public Star(){
        Planets = new ArrayList<Planet>();
    }
    public Star(String name) {
        Planets = new ArrayList<Planet>();
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

    public ArrayList<Planet> getPlanets() {
        return Planets;
    }

    public void addPlanet(Planet planet){

        Planets.add(planet);
    }
}
