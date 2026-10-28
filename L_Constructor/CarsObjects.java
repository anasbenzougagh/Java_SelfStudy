package L_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class CarsObjects {
    public static void main(String[] args) {
        Cars car = new Cars("BMW","X6","Black",2023,45000,new ArrayList<>(Arrays.asList("Normal Key","Push Button")));

        Cars car2 = new Cars("BMW","X5","Black");
        System.out.println(car);
        System.out.println(car2);
    }
}
