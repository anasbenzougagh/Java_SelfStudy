package O_OPPConcepts.G_Polymorphism.Car;

public class CarObject {
    public static void main(String[] args) {
        //object made through super class as reference
        //implicit upcasting
        Car car = new Tesla("Tesla","X","Black",2021,55000);

        //object made through subclass as reference
        //implicit upcasting
        Tesla tesla = new Tesla("Tesla","X","Black",2021,55000);


        car.drive();        //this is a super method

        tesla.drive();
        tesla.autoPark();
        tesla.charge();
        tesla.selfDrive();

        //car.autoPark();     this is a subclass method
        // reference has no access to it only object

        System.out.println("------------------------------------------");

        //DOWNCASTING
        ((Tesla)car).drive();
        ((Tesla)car).autoPark();
        ((Tesla)car).charge();
        ((Tesla)car).selfDrive();

        Tesla tesla1= ((Tesla)car);
        tesla1.drive();
        tesla1.autoPark();
        tesla1.charge();
        tesla1.selfDrive();

        //if super and sub share the same method the object method will be called


    }
}
