package I_Arrays;

import java.util.Arrays;

public class ArraysExplained {
    public static void main(String[] args) {
        //declaring array 1
        String[] days;
        days = new String[7];
        //Assigning values:
        days[0]="Monday";
        days[1]="Tuesday";
        days[2]="Wednesday";
        days[3]="Thursday";
        days[4]="Friday";
        days[5]="Saturday";
        days[6]="Sunday";
        System.out.println(Arrays.toString(days));
        //[Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]

        System.out.println("---------------------------------------------------------------------------------");

        //declaring array 2
        String [] daysOfTheWeek = new String[7];
        //Assigning values:
        daysOfTheWeek[0]="MONDAY";
        daysOfTheWeek[1]="TUESDAY";
        daysOfTheWeek[2]="WEDNESDAY";
        daysOfTheWeek[3]="THURSDAY";
        daysOfTheWeek[4]="FRIDAY";
        daysOfTheWeek[5]="SATURDAY";
        daysOfTheWeek[6]="SUNDAY";
        System.out.println(Arrays.toString(daysOfTheWeek));
        //[MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY]

        System.out.println("---------------------------------------------------------------------------------");

        //declaring array 3 and assigning.
        String[] weekDays = {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
        System.out.println(Arrays.toString(weekDays));
        //[monday, tuesday, wednesday, thursday, friday, saturday, sunday]

        System.out.println(weekDays.equals(days));//false

        Arrays.sort(weekDays);
        System.out.println(Arrays.toString(weekDays));
        //[friday, monday, saturday, sunday, thursday, tuesday, wednesday]

        System.out.println(Arrays.toString(Arrays.copyOf(weekDays,15)));
        //[friday, monday, saturday, sunday, thursday, tuesday, wednesday,null, null, null, null, null, null, null, null]

        System.out.println(Arrays.toString(Arrays.copyOfRange(weekDays,4,7)));
        //[thursday, tuesday, wednesday]
        System.out.println("---------------------------------------------------------------------------------");

        //reversing array elements
        //[Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]
        for (int w = days.length-1; w >= 0; w--) {
            System.out.print(days[w]+" ");
        }

        System.out.println("---------------------------------------------------------------------------------");
        //reversing an array
        String[]array={"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
        String[]reverse= new String[array.length];

        for (int i = array.length-1, k=0; i >= 0 ; i--,k++) {
            reverse[k]=array[i];
        }
        System.out.println(Arrays.toString(reverse));






//            public static int[] reverseArray(int[] array) {
//                int start = 0;
//                int end = array.length - 1;
//
//                while (start < end) {
//                    // Swap elements at start and end indices
//                    int temp = array[start];
//                    array[start] = array[end];
//                    array[end] = temp;
//
//                    // Increment start and decrement end
//                    start++;
//                    end--;
//                }
//
//                return array;


    }
}
