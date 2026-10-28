package S_Extra.C_Lambda_FI;

public class Test {
    public static void main(String[] args) {

        MyFunction cube = (a) -> {
            System.out.println(a*a*a);
        };
        cube.function(10);

        MyFunction oddOrEven = (a) -> {
            System.out.println((a%2==0)? a+" is even" : a+" is odd");
        };
        oddOrEven.function(21);
    }
}
