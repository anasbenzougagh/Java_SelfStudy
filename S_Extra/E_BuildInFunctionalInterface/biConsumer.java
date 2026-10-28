package S_Extra.E_BuildInFunctionalInterface;

import java.util.function.BiConsumer;

public class biConsumer {
    /**Takes two argument of any object and returns void*/
    public static void main(String[] args) {
        BiConsumer<String,Integer> printMultipleTimes = (str,integer) ->{
            for (int i = 0; i < integer; i++) {
                System.out.println(str);
            }
        };
        printMultipleTimes.accept("I will be a Millionaire",10);
    }
}
