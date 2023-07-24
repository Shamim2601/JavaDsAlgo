package SolarSystem;

import java.util.ArrayList;

public class SolarSystem {
    private Star Mystar;

    public SolarSystem(){
    }

    public SolarSystem(Star mystar) {
        Mystar = mystar;
    }

    public Star getMystar() {
        return Mystar;
    }

    public void setMystar(Star mystar) {
        Mystar = mystar;
    }
}
