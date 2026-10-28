package O_OPPConcepts.G_Polymorphism.Car;

import O_OPPConcepts.F_Interface.Test.CanFly;

public abstract class Plane extends Transportation implements CanFly {


    public Plane(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }


    public void land(){
        System.out.println("Plane "+getMake()+" "+getModel() +" is landing");
    }

    @Override
    public void fly() {
        System.out.println(getMake()+" "+getModel()+" is flying");
    }


}
