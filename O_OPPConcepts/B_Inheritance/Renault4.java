package O_OPPConcepts.B_Inheritance;

import java.util.ArrayList;

public class Renault4 extends Cars{

    public boolean madeInFrance;

    public Renault4(String make, String model, String color, int year, double price, ArrayList<String> ignitionType, boolean madeInFrance) {
        super(make, model, color, year, price, ignitionType);
        this.madeInFrance = madeInFrance;
    }

    public void brwita(){
        System.out.println("Can be used as Brwita");
    }
}
