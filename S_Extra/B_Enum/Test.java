package S_Extra.B_Enum;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //enum comes hamdy in switch statements because then contained elements are fixed

        //String day = "Pencil";
        Day day = Day.MONDAY;

        switch (day){
            case MONDAY:
                System.out.println(day);
                break;
            case TUESDAY:
                System.out.println(day);
                break;
            case WEDNESDAY:
                System.out.println(day);
                break;
            case THURSDAY:
                System.out.println(day);
                break;
            case FRIDAY:
                System.out.println(day);
                break;
            case SATURDAY:
                System.out.println(day);
                break;
            case SUNDAY:
                System.out.println(day);
                break;
        }

        //to return what enum contains use values()
        Day[] weekDays = Day.values();
        System.out.println(Arrays.toString(weekDays));
    }
}
