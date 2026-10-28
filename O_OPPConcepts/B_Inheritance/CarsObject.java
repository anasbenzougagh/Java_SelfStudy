package O_OPPConcepts.B_Inheritance;

import O_OPPConcepts.G_Polymorphism.Car.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class CarsObject {
    public static void main(String[] args) {
        Cars tesla = new Tesla("Tesla","Model X","White",2020,50000,new ArrayList<>(Arrays.asList("Push to Start","Voice Command")),true);

        Cars renault4 = new Renault4("Renault","R4","White",1900,100,new ArrayList<>(Arrays.asList("Klamonit Ignition","Slap the steering wheel")),true);



        System.out.println(tesla);
        System.out.println(renault4);

        renault4.isCar();
        tesla.isCar();



        Renault4 renault42 = new Renault4("Renault","R4","White",1900,100,new ArrayList<>(Arrays.asList("Klamonit Ignition","Slap the steering wheel")),true);

        renault42.brwita();
    }
}
