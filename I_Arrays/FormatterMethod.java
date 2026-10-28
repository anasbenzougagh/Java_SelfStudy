package I_Arrays;

import java.text.DecimalFormat;

public class FormatterMethod {
    public static void main(String[] args) {
        double n = 3.1456889;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(n));
        //3.14
    }
}
