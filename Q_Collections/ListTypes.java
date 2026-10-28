package Q_Collections;

import java.util.*;

public class ListTypes {
    /*  <== : extend   <-- : implements     (I): interface  (C): Class

        iterable(I)    <== Collection(I)    <==  List    (I) <--  (ArrayList-LinkedList-Vector-Stack)(C)
                                            <==  Queue   (I) <--  PriorityQueue (C)
                                                             <==  Deque (I)     <-- (LinkedList-ArrayDeque)(C)

                                            <==  Set     (I) <--  (HashSet-LinkedHashSet)(C)
                                                             <==  SortedSet(I)  <--  TreeSet(C)
    */
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(); // Array Based Class ===> get() is faster
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        System.out.println("arrayList: "+ arrayList);
        //[100, 200, 300]
        //Queue<Integer>number = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10))

        System.out.println("-----------------------------------------------------------------------------");

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        System.out.println("linkedList: "+linkedList);
        //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        //each value point to the next value 1<->2<->3<->4<->5<->6<->7<->8<->9<->10
        //inserting and deleting element is faster      //element sorted as node(node based class)
        //retrieving element is slower [go through each element to find the one]

        System.out.println("-----------------------------------------------------------------------------");
        List<Integer> vector = new Vector<>();

        vector.add(100);
        vector.add(200);
        vector.add(300);

        vector.get(0);
        System.out.println("vector: " + vector);

        //Synchronized / Thread safety / Slow comparing to other lists.

        System.out.println("-----------------------------------------------------------------------------");
        Stack<Integer> stack = new Stack<>();
        stack.add(100);
        stack.add(200);
        stack.add(300);

        System.out.println("stack: " + stack);
        //[100, 200, 300]
        int lastElement = stack.pop();
        System.out.println(stack);//[100, 200]

        int secondLastElement = stack.pop();

        System.out.println(secondLastElement);//200
        System.out.println(stack);//[100]

        //Synchronized / LIFO: Last In First Out
    }
}
