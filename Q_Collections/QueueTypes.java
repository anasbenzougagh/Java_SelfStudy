package Q_Collections;

import java.util.*;

public class QueueTypes {
    public static void main(String[] args) {
        /*
        Set interface:  Allows duplicates
                        FIFO First in First Out
                        Insertion order not preserved
        */
        Queue <Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(10,200,300,40,90));
        priorityQueue.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println(priorityQueue);
        //[10, 40, 10, 40, 90, 300, 200, 300, 200, 90]
        //random order          Doesn't accept null

        System.out.println("-------------------------------------------------");

        Queue <Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(10,200,300,40,90));
        arrayDeque.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println(arrayDeque);
        //[10, 200, 300, 40, 90, 10, 200, 300, 40, 90]
        //insertion order          Doesn't accept null

        System.out.println("-------------------------------------------------");

        Queue <Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(10,200,300,40,90));
        linkedList.addAll(Arrays.asList(10,200,300,40,90,null));
        System.out.println(linkedList);
        //[10, 200, 300, 40, 90, 10, 200, 300, 40, 90,null]
        //insertion order          accepts null

    }
}
