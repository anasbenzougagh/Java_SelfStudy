package R_Maps;

import java.util.Map;
import java.util.TreeMap;

public class C_MapsMethods {
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
        //{0=Monday, 1=Tuesday, 2=Wednesday, 3=Thursday, 4=Friday, 5=Saturday, 6=Sunday}
        System.out.println("map.size() = " + map.size());//map.size() = 7
        System.out.println("map.get(2) = " + map.get(2));//map.get(2) = Tuesday

        map.replace(0,"MONDAY");
        System.out.println(map);
        //{0=MONDAY, 1=Tuesday, 2=Wednesday, 3=Thursday, 4=Friday, 5=Saturday, 6=Sunday}

        map.remove(6);
        System.out.println(map);
        //{0=MONDAY, 1=Tuesday, 2=Wednesday, 3=Thursday, 4=Friday, 5=Saturday}

        System.out.println("map.containsKey(7) = " + map.containsKey(7));//false
        System.out.println("map.containsKey(\"Saturday\") = " + map.containsValue("Saturday"));//= true
        System.out.println("map.isEmpty() = " + map.isEmpty());//false
        System.out.println("map.equals(map) = " + map.equals(map));//true

        map.clear();
        System.out.println(map);//{}

        Map <Integer,String> map2 = new TreeMap<>();
        map.put(0,"Monday");
        map.put(1,"Tuesday");
        map.put(2,"Wednesday");
        map.put(3,"Thursday");
        map.put(4,"Friday");
        map.put(5,"Saturday");
        map.put(6,"Sunday");


        map.putAll(map2);
        System.out.println(map);
        //{0=Monday, 1=Tuesday, 2=Wednesday, 3=Thursday, 4=Friday, 5=Saturday, 6=Sunday}

        System.out.println("-------Iteration methods-------");
        //entrySet()
        for (Map.Entry<Integer,String> eachEntry : map.entrySet()){
            //Entry Interface: to get access to
            System.out.println(eachEntry);
            /*  1=Tuesday
                2=Wednesday
                3=Thursday
                4=Friday
                5=Saturday
                6=Sunday
            */
        }

        //keySet()
        for (Integer eachKey : map.keySet()){
            System.out.print(eachKey+" ");//0 1 2 3 4 5 6
        }
        System.out.println();

        //valueSet()
        for(String eachValue : map.values()) {
            System.out.print(eachValue+" ");
            //Monday Tuesday Wednesday Thursday Friday Saturday Sunday
        }

        //entrySet()    keySet()    valueSet()  setValue()
        //entrySet() = (keySet() +"="+ valueSet())
        for (Map.Entry <Integer,String> eachEntry : map.entrySet()){
            Integer eachKey = eachEntry.getKey();
            String eachValue = eachEntry.getValue();
            System.out.println(eachKey + " : " + eachValue);
              /*0 : Monday
                1 : Tuesday
                2 : Wednesday
                3 : Thursday
                4 : Friday
                5 : Saturday
                6 : Sunday
                */

        //setValue()
            eachEntry.setValue(eachValue.toUpperCase());
        }
        System.out.println(map);
        //{0=MONDAY, 1=TUESDAY, 2=WEDNESDAY, 3=THURSDAY, 4=FRIDAY, 5=SATURDAY, 6=SUNDAY}
        //There is no setKey() method because keys are final

        System.out.println("forEach: ");
        map.forEach((k,v)-> System.out.println(k + " : " + v));



    }
}
