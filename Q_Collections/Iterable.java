package Q_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterable {
    //Iterable interface is the parent of Collection:
    //has these methods iterable() / hasNext() / next() / remove()
    //used implicitly in for each loop
    public static void main(String[] args) {

    List<Integer>list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

    Iterator <Integer> it = list.iterator();

    /**While loop**/
    //we used line 16 to give access to iterable interface
    while (it.hasNext()){//has a next index to lock
        Integer each = it.next();
        //each is locked element ins hasNext() index
        //return type have to match the collection type
        if(each<5){
            it.remove();
        //condition met = remove
        }
    }
        System.out.println(list);//[5, 6, 7, 8, 9, 10]
        System.out.println("---------------------------------------------------");
    /**for i loop**/
    for(Iterator<Integer> i = list.iterator();i.hasNext();){
        Integer each = i.next();
        if(each<6){
            i.remove();
        }
    }
        System.out.println(list);//[6, 7, 8, 9, 10]

        list.removeIf(each -> each <7);
        System.out.println(list);//[7, 8, 9, 10]
        //removeIf implicitly uses Iterator







    }
}
