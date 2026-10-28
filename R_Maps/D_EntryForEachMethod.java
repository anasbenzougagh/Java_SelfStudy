package R_Maps;

import java.util.Map;
import java.util.TreeMap;

public class D_EntryForEachMethod {
    public static void main(String[] args) {
        Map <Integer,String> map = new TreeMap<>();
        map.put(0,"Monday");
        map.put(1,"Tuesday");
        map.put(2,"Wednesday");
        map.put(3,"Thursday");
        map.put(4,"Friday");
        map.put(5,"Saturday");
        map.put(6,"Sunday");
        System.out.println(map);

        for (Map.Entry <Integer,String> entry : map.entrySet()){
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("MapEntry = " + key + " : " + value);
        }

        map.forEach((K,V)-> System.out.println("For Each () = " + K + " : " + V));
    }
}
