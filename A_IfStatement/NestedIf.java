package A_IfStatement;

public class NestedIf {
    public static void main(String[] args) {
        double a= 30000;
        String b= "Dollars";
        if(a>=30000){//if first not met, won't move to next
            System.out.println("good salary");
            if(b.equalsIgnoreCase("dollars")){
                System.out.println("right currency");
            }
        }

    }
}
