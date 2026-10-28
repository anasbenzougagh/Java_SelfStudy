package D_String;

public class StringStackHeapPoolJVM {
    public static void main(String[] args) {
        /*
        JVM [
            - Stack is used for execution                 : Method Invocations | Local variables
            - Heap(String pool) is used for storage       : Objects            | Instance variables
            ]
        */

        //str3 => stack memory | Java => one in the Heap Memory | and another in String Pool (if variable with same declaration wasn't created)
        String str3 = new String("Java");    //New string object
        //Once declared will look at String pool if there isn't any, it will create one and then a crate an object
        String str1 ="Java";                        //String literals
        // => string pool {points to an SP version pre-exiting in heap} multiple values
        String str2 ="Java";                        //String literals
        // => string pool {points to an SP version pre-exiting in heap} multiple values

        System.out.println(str1==str2);             //true
        System.out.println(str1.equals(str2));      //true

        System.out.println("comparing copy object to original object: \n" + str1==str3);        //fales
        System.out.println("comparing copy object to original object: \n" + str2==str3);        //fales
        System.out.println("comparing copy value to original value: \n" + str1.equals(str3));   //true
        System.out.println("comparing copy value to original value: \n" + str2.equals(str3));   //true


        /*
                                                        Number of objects
          String s1 = new String("Java");                       2 (Heap + SP)
          String s2 ="hello";                                   1 (SP)
          String s3 ="hello";                                   0 (points to SP)
          String s4 = new String("Java");                       1 (points to heap)
          String s5 ="Java";                                    0 (points to SP)
        */
    }
}
