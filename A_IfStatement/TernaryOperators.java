package A_IfStatement;

public class TernaryOperators {
    public static void main(String[] args) {
        int a= 20;
        int b= 15;

        if(a>b){
            System.out.println("yes");
        }else {
            System.out.println("No");
        }

        System.out.println((a<b) ? "yes" : "no" );
    }
}
