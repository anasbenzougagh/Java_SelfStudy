package P_Exceptions.BreakTime;



public class BreakTimeException extends RuntimeException {
    public BreakTimeException(){
        super("It's break time");
    }//default message

    public BreakTimeException(String message){
        super(message);
    }//overloaded custom message
}
