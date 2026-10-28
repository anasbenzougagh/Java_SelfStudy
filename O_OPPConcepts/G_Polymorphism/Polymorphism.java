package O_OPPConcepts.G_Polymorphism;

import O_OPPConcepts.B_Inheritance.Cars;
import O_OPPConcepts.B_Inheritance.Tesla;

public class Polymorphism {
    //Polymorphism happens when the
    /*reference type is super class/interface
      and object type is child*/
    //Cars car = new Tesla();

    //CALLING METHODS OR VARIABLES:
    //you can call methods from parent using
    //e.g.  car.start();            [start() is a super method]
    //      car.voiceCommand();     [voiceCommand() is subclass method] //compiler error
    //                                 can't call subclass methods with parent reference
}
