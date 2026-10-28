package S_Extra.D_Generics;

import java.util.List;

public class Generics<T> {
    //Parameterized types
    //Reuse of different data types [methods, classes, interfaces]
    //Deals mainly with non-primitives

    /**To avoid duplicating we use Genetics*/

    /*public static void printEach (Integer [] array){
        for (Integer each : array){
            System.out.println(each);
        }
    }
    public static void printEach (Character [] array){
        for (Character each : array){
            System.out.println(each);
        }
    }
    public static void printEach (Double [] array){
        for (Double each : array){
            System.out.println(each);
        }
    }
    public static void printEach (String [] array){
        for (String each : array){
            System.out.println(each);
        }
    }*/

    /*** Generics <Type>: without using it on class level*/
//    public static <T> void printEach(T[] array) {
//        for (T each : array) {
//            System.out.println(each);
//        }
//    }
//
//    public static <T> void printEach(List<T> list) {
//        for (T each : list) {
//            System.out.println(each);
//        }
//    }
    /**In case there multiple Generic methods you can apply it on class
     * once added to the class: You have there is no need to add <T> for each method
     *                          You have to remove static keyword for the method => instance methods
     */

    /*** Generics <Type>: while using it on class level*/
    public void printEach(T[] array) {
        for (T each : array) {
            System.out.println(each);
        }
    }

    public void printEach(List<T> list) {
        for (T each : list) {
            System.out.println(each);
        }
    }

    public static void main(String[] args) {

        Integer[] number = {10, 20, 30, 40, 50};
        Double[] decimals = {1.5, 2.5, 3.5, 4.5, 5.5};
        Character[] characters = {'A', 'B', 'C', 'D', 'E'};
        String[] strings = {"Java", "Python", "SQL", "Wooden Spoon"};

        /*** Generics <Type>: without using it on class level*/
        //printEach(number);
        //printEach(decimals);
        //printEach(characters);
        //printEach(strings);

        /*** Generics <Type>: while using it on class level*/
        Generics<Integer> numberObject = new Generics<>();
        //Generics<Double> decimalsObject = new Generics<>();
        //Generics<Character> charactersObject = new Generics<>();
        //Generics<String> stringsObject = new Generics<>();

        //You have to creat an object  77 form generics with matching data type.
        // once the <> is passed on class level [because: method are static]
        numberObject.printEach(number);


        //Once declared cannot be changed, unlike using add method.
        List<Integer> numberList = List.of(10, 20, 30, 40, 50);
        List<Double> decimalsList = List.of(1.5, 2.5, 3.5, 4.5, 5.5);
        List<Character> charactersList = List.of('A', 'B', 'C', 'D', 'E');
        List<String> stringsList = List.of("Java", "Python", "SQL", "Wooden Spoon");

        /*** Generics <Type>: without using it on class level*/
        //printEach(numberList);
        //printEach(decimalsList);
        //printEach(charactersList);
        //printEach(stringsList);

        /*** Generics <Type>: while using it on class level*/
        //You have to creat an object form generics with matching data type.
        // once the <> is passed on class level [because: method are static]
        numberObject.printEach(numberList);
    }
}
