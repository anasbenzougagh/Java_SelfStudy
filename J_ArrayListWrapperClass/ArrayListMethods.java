package J_ArrayListWrapperClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<String> days = new ArrayList ();
        //new ArrayList (Arrays.asList("tuesday","wednesday","thursday","friday","saturday","sunday"));

        //add()
        days.add("monday");//add to index 0
        //addAll()
        days.addAll(Arrays.asList("tuesday","wednesday","thursday","friday","saturday","sunday"));
        System.out.println(days); 
        //[monday, tuesday, wednesday, thursday, friday, saturday,"sunday"]
        //size()
        System.out.println("days.size() = " + days.size());
        //get()
        System.out.println("days.get(1) = " + days.get(1));

        //set() : replace
        days.set(6,"Sunday");
        System.out.println(days);
        //remove(index||object)
        days.remove("monday");
        System.out.println(days);
        //indexOf()
        System.out.println("days.indexOf(\"Sunday\") = " + days.indexOf("Sunday"));
        //lastIndexOf()
        System.out.println("days.lastIndexOf(\"friday\") = " + days.lastIndexOf("friday"));

        //days.contains()
        System.out.println("days.contains(\"mamaduday\") = " + days.contains("mamaduday"));
        //days.equals()
        System.out.println("days.equals(\"friday\") = " + days.equals(days));
        //days.containsAll()
        System.out.println("days.containsAll() = " + days.containsAll(Arrays.asList("tuesday", "Sunday")));
        //days.retainAll()
        days.retainAll(Arrays.asList("tuesday", "wednesday","thursday"));
        System.out.println(days);
        //
        days.removeAll(Arrays.asList("tuesday", "wednesday"));
        System.out.println("days.removeAll(Arrays.asList(\"tuesday\", \"wednesday\"))" + days);
        //clear()
        //days.clear()
        days.clear();
        System.out.println(" days.clear() " + days);
        System.out.println("--------------------------------------------------------------------------");
        days.addAll(Arrays.asList("tuesday","wednesday","thursday","friday","saturday","sunday"));
        days.add(0,"monday");

        //addAll(index,list)
        days.addAll(7,Arrays.asList("\nMONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY\n"));
        System.out.println(days);
        System.out.println("---------------------------------------------------------------------------------");
        //adding elements form array
        String[] daysCap = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        days.addAll(14,Arrays.asList(daysCap));
        System.out.println(days);
    }
}
