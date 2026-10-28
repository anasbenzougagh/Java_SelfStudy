package S_Extra.A_StringBuilderBuffer;

public class A_StringBuilderBuffer {
    public static void main(String[] args) {
        //String
        String str1 = "Wooden";                      //String literal
        String str2 = new String("Wooden Spoon");   //new keyword

        str1.concat(" Spoon");//[immutable: cannot be modified]
        System.out.println(str1);

        str1= str1.concat(" Spoon");
        System.out.println(str1);

        System.out.println("----------------------------------------------------------------");

        //String Builder
        StringBuilder sb = new StringBuilder("Wooden");
        sb.append(" Spoon");   //[mutable: can be modified]
        //                              [not synchronized]
        System.out.println(sb);

        System.out.println("----------------------------------------------------------------");

        //String Buffer
        StringBuffer sbu = new StringBuffer("Wooden");
        sbu.append(" Spoon");   //[mutable and synchronized]
        System.out.println(sbu);


    }
}
