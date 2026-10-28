package R_Maps;

import java.util.*;

public class B_MapTypes {
    public static void main(String[] args) {

        Map<String,Integer> hashMap = new HashMap<>();
        //random order            Accepts null as value key
        hashMap.put("Monday",1);
        hashMap.put("Tuesday",2);
        hashMap.put("Wednesday",3);
        hashMap.put("Thursday",4);
        hashMap.put("Friday",5);
        hashMap.put("Saturday",null);
        hashMap.put(null,7);
        System.out.println("hashMap: \n"+hashMap);
        //{null=7, Monday=1, Thursday=4, Friday=5, Wednesday=3, Tuesday=2, Saturday=null}

        //to change value, use same key with different value[latter replace prior]
        //if there are similar key in task new map has to be created.
        System.out.println("-----------------------------------------------------------------------");
        Map<String,Integer> linkedHashMap = new LinkedHashMap<>();
        //maintains insertion order         Accepts null as value key
        linkedHashMap.put("Tuesday",2);
        linkedHashMap.put("Monday",1);
        linkedHashMap.put("Wednesday",3);
        linkedHashMap.put("Thursday",4);
        linkedHashMap.put("Friday",5);
        linkedHashMap.put("Saturday",null);
        linkedHashMap.put(null,7);
        System.out.println("linkedHashMap: \n"+linkedHashMap);
        //{Tuesday=2, Monday=1, Wednesday=3, Thursday=4, Friday=5, Saturday=null, null=7}

        System.out.println("-----------------------------------------------------------------------");

        Map<String,Integer> treeMap = new TreeMap<>();
        //Ascending order[key]        Doesn't accept null [as key]
        treeMap.put("Tuesday",2);
        treeMap.put("Monday",1);
        treeMap.put("Wednesday",3);
        treeMap.put("Thursday",4);
        treeMap.put("Friday",5);
        treeMap.put("Saturday",6);
        treeMap.put("Sunday",null);
        System.out.println("treeMap: \n"+treeMap);
        //{Friday=5, Monday=1, Saturday=6, Sunday=null, Thursday=4, Tuesday=2, Wednesday=3}
        System.out.println("-----------------------------------------------------------------------");

        Map<String,Integer> hashtable = new Hashtable<>();
        //Synchronized - random order - Doesn't accept null [as key] or [value]
        hashtable.put("Tuesday",2);
        hashtable.put("Monday",1);
        hashtable.put("Wednesday",3);
        hashtable.put("Thursday",4);
        hashtable.put("Friday",5);
        hashtable.put("Saturday",6);
        hashtable.put("Sunday",7);
        System.out.println("hashtable: \n"+hashtable);
        //{Tuesday=2, Friday=5, Thursday=4, Sunday=7, Saturday=6, Wednesday=3, Monday=1}
    }
}
