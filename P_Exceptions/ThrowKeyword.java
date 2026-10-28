package P_Exceptions;

import java.util.InputMismatchException;

public class ThrowKeyword {

    public static class UnderAge extends RuntimeException{

    }
    public static void main(String[] args) {
        int age = 17;
        if(age<18){
            throw new InputMismatchException("Under age: "+age);
        }
    }
}
