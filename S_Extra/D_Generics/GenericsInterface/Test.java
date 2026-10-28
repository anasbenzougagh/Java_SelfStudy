package S_Extra.D_Generics.GenericsInterface;

//lambda syntax :   () parameters     -> arrow token       {} lambda expression's body
//                  ()-> {statements}           takes no arguments
//                  (Parameters)->{statements}  takes arguments

public class Test {
    public static void main(String[] args) {

        /**Since the interface has Generic on interface level object has to be created
         * Once the object is created the data type must be set
         * Lambda expression is used to override the functional interface*/

        MyFunction<Integer> displayCuber =
                (a) -> {
            System.out.println(a * a * a);
        };
        displayCuber.function(100);


        // (a) {} -> parentheses and curly-braces are option for one parameter
        MyFunction<String> thirdCharacter =
                a -> System.out.println("Third character is " + a.charAt(2));
        thirdCharacter.function("Third");

        //ForEach method used with Maps is based on this
    }
}
