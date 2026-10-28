package E_Methods;

public class D_Overloading {
    public static String next(String song){
        return "Pushing next ...\n Now playing: "+song;
    }
    public static String next(String song,String artist){
        return "Pushing next ...\nNow playing: "+ song +"\nby: "+ artist;
    }

    public static void main(String[] args) {
        System.out.println(next("Start again","Logic"));
    }
}
