package P_Exceptions;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException{
                        //using throws to handle it temporarily meaning that the exception
                        //will occur when every method is called
        System.out.println("Hello");
        Thread.sleep(3000);//Checked Exception
        System.out.println("World");
    }
}
