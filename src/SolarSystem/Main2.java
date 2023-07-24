package SolarSystem;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Star star = new Star();
        SolarSystem solarSystem = new SolarSystem();

        System.out.println("Solar System Info:");
        while(true){
            System.out.println("\n1. View System\n2. Add System\n3. Update System\n4. Quit");
            System.out.print("Enter choice[1-4]: ");
            int choice = scanner.nextInt();

            if(choice==1){
//                System.out.println("1");
                if(solarSystem.getMystar()==null){
                    System.out.println("Yet to be added...");
                    continue;
                }
                System.out.println("Your Solar System:");
                System.out.println(solarSystem.getMystar().getName());

                for(Planet p: solarSystem.getMystar().getPlanets()){
                    System.out.println("\t"+p.getName());
                    for(Satellite sat: p.getSatellites()){
                        System.out.println("\t\t"+sat.getName());
                    }
                }
            }else if(choice==2){
//                System.out.println("2");
                System.out.print("Enter name of star: ");
                String starName = scanner.next();  //camel case; star_name(c,cpp,python)

                star = new Star(starName);
                solarSystem = new SolarSystem(star);

                while(true){
                    System.out.print("Enter name of planet [done if no more to add]: ");
                    String pName = scanner.next();
                    if(pName.equalsIgnoreCase("done")) break;
                    Planet planet = new Planet(pName);
                    solarSystem.getMystar().addPlanet(planet);
                    while(true){
                        System.out.print("Enter name of satellite [done if no more to add]: ");
                        String satName = scanner.next();
                        if(satName.equalsIgnoreCase("done")) break;
                        Satellite satellite = new Satellite();
                        satellite.setName(satName);
                        planet.addSatellite(satellite);
                    }
                }
            }else if(choice==3){
//                System.out.println("Not impl");
                System.out.println("1. Update Star\n2. Update Planet\n3. Update Satellite");
                int choice2 = scanner.nextInt();
                if(choice2==1){
                    System.out.println("1. Update name\n2. Update radius");
                    int choice3 = scanner.nextInt();
                    if(choice3==1){
                        System.out.print("enter name: ");
                        String name = scanner.next();
                        star.setName(name);
                    }else{
                        System.out.println("enter radius: ");
                        double radius = scanner.nextDouble();
                        star.setRadius(radius);
                    }
                }
            }else if(choice==4){
                System.exit(0);
            }else{
                System.out.println("Wrong input. Try again...");
            }
        }
    }
}
