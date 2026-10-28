package Q_Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionMethods {
    public static void main(String[] args) {
        ArrayList<String> days = new ArrayList<>();
        days.add("Monday");
        days.addAll(Arrays.asList("Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));

        ArrayList<String> workingDays = new ArrayList<>();
        workingDays.addAll(Arrays.asList("Monday","Tuesday", "Wednesday", "Thursday"));

        System.out.println("days.size() = " + days.size());             //7

        System.out.println("days.isEmpty() = " + days.isEmpty());       //false

        days.remove("Monday");
        System.out.println(days);           //[Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]

        days.removeAll(workingDays);
        System.out.println(days);           //[Friday, Saturday, Sunday]

        days.removeIf(p->p.equalsIgnoreCase("Sunday"));
        System.out.println(days);           //[Friday, Saturday]

        System.out.println("days.contains(\"Saturday\") = " + days.contains("Saturday"));//true
        System.out.println("days.containsAll(workingDays) = " + days.containsAll(workingDays));//false

        days.removeAll(days);
        days.addAll(Arrays.asList("Monday","Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));

        System.out.println((days.toArray()));//[Ljava.lang.Object;@7f690630
        System.out.println(Arrays.toString(days.toArray()));
        //[Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]

        days.retainAll(workingDays);
        System.out.println(days);//[Monday, Tuesday, Wednesday, Thursday]

        days.clear();
        System.out.println(days);//[]


    }
}
