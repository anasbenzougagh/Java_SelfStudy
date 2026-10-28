package O_OPPConcepts.D_FinalKeyword;

public class FinalKeyword {
    //cannot be: inherited(class) - Re-assign/change value(variable) - Override(method)
    //can be overloaded: every single method can be overloaded.
    public static void main(String[] args) {

    //------------------------------------------------------------------------------------------
        final int number = 100;
        //number=200; can't change final value
        //yet can be inherited in subclasses
    }

    //------------------------------------------------------------------------------------------
    public class Vehicle {
        public final void transportation(){
            System.out.println("Public transportation");
        }
    }

    public class BMW extends Vehicle{
//        public void transportation(){     //final methods can be overridden
//            System.out.println("Public transportation");
//        }
    }

    //------------------------------------------------------------------------------------------
    public final class Weapons {

    }

//    public class Glock extends Weapons{   //final class can't be inherited
//
//    }
}
