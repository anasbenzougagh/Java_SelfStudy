package P_Exceptions.Gym;

import java.util.Scanner;

public class GoToTheGymExceptionTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how you feel:");
        String feelings = input.next();

        if(feelings.equalsIgnoreCase("Normal")){
            throw new GoToTheGymException();
        }else {
            throw new GoToTheGymException("Go to the fucking gym");
        }

    }
}
