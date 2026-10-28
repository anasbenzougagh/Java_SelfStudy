package E_Methods;

public class C_ReturnMethods {
    public static String next(String song){
        return "Pushing next ...\n Now playing: "+song;
    }

    public static void main(String[] args) {
        System.out.println(next("Enemyz"));
    }
}
