package SolarSystem;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name of star: ");
        String starName = scanner.next();  //camel case; star_name(c,cpp,python)


        Star star = new Star(starName);

        SolarSystem solarSystem = new SolarSystem(star);

        while(true){
            System.out.print("Enter name of planet [done if no more to add]: ");
            String pName = scanner.next();
            if(pName.equalsIgnoreCase("done")) break;
            Planet planet = new Planet(pName);
            solarSystem.addPlanet(planet);
        }

        System.out.println("Your Solar System:");
        System.out.println(solarSystem.getMystar().getName());

        for(Planet p: solarSystem.getPlanets()){
            System.out.println("\t"+p.getName());
        }
//        System.out.println(solarSystem.getMystar().getName());
    }

}
