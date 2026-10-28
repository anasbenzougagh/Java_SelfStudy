package O_OPPConcepts.A_Encapculation;

import java.util.ArrayList;
import java.util.Arrays;

public class PersonTest {
    public static void main(String[] args) {

        Person person = new Person("Anas",27,'M',new ArrayList<>(Arrays.asList("English","French","English")));
        System.out.println(person);
    }
}
