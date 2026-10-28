package P_Exceptions;

public class ExceptionsExplained {
    //there are two types of exception:

    //checked   :   during compile time     the code won't compile
    //              [has an inheritance relationship with RuntimeException]

    //unchecked :   during runtime          the code will compile
    //              [has an inheritance relationship with RuntimeException]

    //error     :   during runtime          is more like illegal operation
    //              [not recommend to be handled]

    //Handling an exception:
    //try catch block
    public static void main(String[] args) {
        try{
            //try block statements
            //some code that might throw exception
        }catch (RuntimeException e){
            //catch block statements
            //handle exception (if try block can't)
        }

        try {
            System.out.println(9/0); //ArithmeticException
            System.out.println("Try block");
        }catch (ClassCastException e){
            //e.printStackTrace();      => prints the message with exception associated to it
            //e.getMessage();           => by zero : simpler
            System.out.println("Catch block");
        }
        //you can add as many catch blocks as you wish
        /**
         - On one condition: from subclass going downward to superclass
         small net to bigger net. (child => parent => grandparent)
         - You can add finally keyword at the end the biggest net.
            finally can be stopped  by System.exit(1)
         **/
    }
}
