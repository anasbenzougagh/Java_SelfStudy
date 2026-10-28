package I_Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] weekDays = {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
        for (String day : weekDays){
            System.out.println(day.toUpperCase());
        }
    }
}
