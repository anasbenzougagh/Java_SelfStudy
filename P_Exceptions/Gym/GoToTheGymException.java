package P_Exceptions.Gym;

public class GoToTheGymException extends RuntimeException{
    public GoToTheGymException(){
        super("Go the gym");
    }
    public GoToTheGymException(String message){
        super(message);
    }
}
