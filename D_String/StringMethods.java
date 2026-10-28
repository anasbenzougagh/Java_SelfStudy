package D_String;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Means nothing, not going to happen. ";
                    //01234567890123456789012345678901234567

        System.out.println("str.charAt(0) = " + str.charAt(0));
        //M
        System.out.println("str.length() = " + str.length());
        //37
        System.out.println("str.toLowerCase() = " + str.toLowerCase());
        //means nothing, not going to happen. //
        System.out.println("str.toUpperCase() = " + str.toUpperCase());
        //MEANS NOTHING, NOT GOING TO HAPPEN. //

        System.out.println("str.trim() = " + str.trim());
        //Means nothing, not going to happen.//
        System.out.println("str.indexOf(\",\") = " + str.indexOf(","));
        //13
        System.out.println("str.lastIndexOf(\"n\") = " + str.lastIndexOf("n"));
        //33
        System.out.println("str.replace(\"Not\",\"NOT\") = " + str.replace("not", "NOT"));
        //Means NOThing, NOT going to happen. //

        System.out.println("str.replaceFirst(\",\",\".\") = " + str.replaceFirst(",", "."));
        //Means nothing. not going to happen. //
        System.out.println("str.substring(1) = " + str.substring(1));
        //eans nothing, not going to happen. //
        System.out.println("str.substring(14,35) = " + str.substring(14,35));
        //not going to happen. //
        System.out.println("str.repeat(5) = " + str.repeat(2));
        //Means nothing, not going to happen. Means nothing, not going to happen.

        String str2 = " ";
        System.out.println("str2 = " + str2);
        System.out.println("str2.isEmpty() = " + str2.isEmpty());
        //false
        System.out.println("str2.isBlank() = " + str2.isBlank());
        //true

        System.out.println("str.equalsIgnoreCase(str2) = " + str.equalsIgnoreCase(str2));
        //false
        System.out.println("str.contains(\"not\") = " + str.contains("not"));
        //true
        System.out.println("str.startsWith(\"Means\") = " + str.startsWith("Means"));
        //ture
        System.out.println("str.endsWith(\".\") = " + str.endsWith("."));
        //false

    }
}
