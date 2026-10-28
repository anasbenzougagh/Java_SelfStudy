package F_Loops;

public class ForLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            System.out.println("Day " + i);
            if (i == 5 || i == 12) {
                System.out.println("Day " + i + " Blessed");
            }
            if (i == 14) {
                break; //stop will not iterate to remaining loops
            }
        }
        System.out.println("-----------------------------------------");
        for (char i = 'A'; i < 'Z'; i++) { //A to Z
            if (i=='B'){
                System.out.println("SKIP this 'B'");
                continue;
            }
            if(i=='G'){
                System.out.println("EXIT here 'G'");
                break;
            }

                System.out.println(i);
        }

    }
}



