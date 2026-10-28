package J_ArrayListWrapperClass;

public class CharacterMethods {
    public static void main(String[] args) {
        char ch1='1';
        char ch2='A';
        char ch3='@';

        //IsDigit
        System.out.println(Character.isDigit(ch1));                     //  char ch1='1'  true
        System.out.println(Character.isLetter(ch2));                    //  char ch2='A'  true

        System.out.println(Character.isLowerCase(ch2));                 //  char ch2='A'  false
        System.out.println(Character.isUpperCase(ch2));                 //  char ch2='A'  true

        boolean isSpecialCharacter = !(Character.isLetterOrDigit(ch3)); //notLetterOrDigit
        System.out.println(isSpecialCharacter);                         //  char ch3='@'  true
    }
}
