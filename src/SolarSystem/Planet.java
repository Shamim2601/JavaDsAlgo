package SolarSystem;

public class Planet {
    private String Name;
    private double Radius;

    public Planet(String name) {
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
}
