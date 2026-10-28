package C_Scanner;

import java.util.Scanner;

public class ScannerT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you name: ");
        String name = input.nextLine();
        System.out.println(name);
        //nextByte()   nextShort()   nextInt()  nextLong()
        //nextFloat()   nextDouble()    nextBoolean()   next()
        //nextLine()
        input.close();
    }
}
