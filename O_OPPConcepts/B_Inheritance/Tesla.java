package O_OPPConcepts.B_Inheritance;

import java.util.ArrayList;
import java.util.Arrays;

public class Tesla extends Cars{

    boolean isElectric;


    public Tesla(String make, String model, String color, int year, double price, ArrayList<String> ignitionType,boolean isElectric) {
        super(make, model, color, year, price, ignitionType);
        this.isElectric = isElectric;
    }

    public String VoiceCommand(){
        return "Say start to ignite";
    }


}
