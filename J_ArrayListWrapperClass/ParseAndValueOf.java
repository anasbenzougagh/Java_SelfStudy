package J_ArrayListWrapperClass;

public class ParseAndValueOf {
    public static void main(String[] args) {
        //parse...() turns string of numbers into a primitive value

        String number = "15";
        int n = Integer.parseInt(number);
        double n2 = Double.parseDouble(number);

        //Primitive.parsePrimitive()
        System.out.println(n+1); //16
        System.out.println((Integer.parseInt(number))+15); //30

        //valueOf()turns string of numbers into a wrapper class value

        Integer nWC = Integer.valueOf(number);
        Double nWC2 = Double.valueOf(number);

        //WrapperClass.valueOf();

    }
}
