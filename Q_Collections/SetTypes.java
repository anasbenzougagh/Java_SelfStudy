package Q_Collections;

import java.util.*;

public class SetTypes {
    public static void main(String[] args) {
        /*Set interface:    Duplicates aren't allowed
                            Has no indexes
                            Insertion order not preserved
        */
        Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(10,200,300,40,90,null));
        hashSet.addAll(Arrays.asList(10,200,300,40,90,null));
        hashSet.addAll(Arrays.asList(10,200,300,40,90,null));
        hashSet.addAll(Arrays.asList(10,200,300,40,90,null));
        System.out.println(hashSet);//[null,200, 40, 10, 90, 300]
        //random order              //accepts null
        
        
        System.out.println("-----------------------------------------------------------");
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90,null));
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90,null));
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90,null));
        linkedHashSet.addAll(Arrays.asList(10,200,300,40,90,null));
        System.out.println(linkedHashSet);//[10, 200, 300, 40, 90, null]
        //insertion order           //accepts null
        
        System.out.println("-----------------------------------------------------------");
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        //treeSet.addAll(Arrays.asList(10,200,300,40,90,null));
        System.out.println(treeSet);
        //sort in ascending         //doesn't accept null
        
    }
}
