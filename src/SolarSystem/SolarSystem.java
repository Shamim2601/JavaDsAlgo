package SolarSystem;

import java.util.ArrayList;

public class SolarSystem {
    private Star Mystar;
    private ArrayList<Planet> Planets;

    public SolarSystem(Star mystar) {
        Mystar = mystar;
        Planets = new ArrayList<Planet>();
    }

    public Star getMystar() {
        return Mystar;
    }

    public void setMystar(Star mystar) {
        Mystar = mystar;
    }

    public ArrayList<Planet> getPlanets() {
        return Planets;
    }

    public void addPlanet(Planet planet){
        Planets.add(planet);
    }
}
