package O_OPPConcepts.G_Polymorphism.Car;

import O_OPPConcepts.F_Interface.Test.CanFly;

public class CydeoCar extends Car implements  Electric, AutoPilot, CanFly {
    public CydeoCar(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }


    @Override
    public void autoPark() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void charge() {

    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }

    @Override
    public void fly() {

    }
}
