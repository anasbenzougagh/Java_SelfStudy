package P_Exceptions.BreakTime;

public class BreakTimeExceptionTest {
    public static void main(String[] args) {
        int taskToDo = 1;
        if(taskToDo==0){
            throw new BreakTimeException();
        }
        throw new BreakTimeException("We still have: " + taskToDo + " "+ "task(s) to do");
    }
}
