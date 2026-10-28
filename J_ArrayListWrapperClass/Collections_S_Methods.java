package J_ArrayListWrapperClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collections_S_Methods {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,20,3,10,75,0,3,65,7,18,3,9,3,41));

        //Collections.max(numbers)
        System.out.println("Collections.max(numbers) = " + Collections.max(numbers));//75
        //Collections.min(numbers)
        System.out.println("Collections.min(numbers) = " + Collections.min(numbers));//0

        //Collections.sort(numbers)
        Collections.sort(numbers);
        System.out.println(numbers);//[0, 1, 3, 3, 3, 3, 7, 9, 10, 18, 20, 41, 65, 75]

        //Collections.reverse(numbers)
        Collections.reverse(numbers);
        System.out.println(numbers);//[75, 65, 41, 20, 18, 10, 9, 7, 3, 3, 3, 3, 1, 0]

        //Collections.swap()
        Collections.swap(numbers,0,10);
        System.out.println(numbers);//[3, 65, 41, 20, 18, 10, 9, 7, 3, 3, 75, 3, 1, 0]

        //Collections.replaceAll()
        Collections.replaceAll(numbers,3,9);
        System.out.println(numbers);//[9, 65, 41, 20, 18, 10, 9, 7, 9, 9, 75, 9, 1, 0]

        System.out.println("Collections.frequency(numbers,9) = " + Collections.frequency(numbers, 9));
        //5
    }
}
