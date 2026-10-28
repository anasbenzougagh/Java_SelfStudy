package H_MemoryAllocationAndGC;

public class GarbageCollection {
    public static void main(String[] args) {
        int a = 7;
        int b = 5;//at line 9 this variable will be Eligible for GC
        String c = "Java";//at lane 11 this variable will be Eligible for GC
        System.out.println("a:" + a + "\n" + "b:" + b);
        b = a;
        System.out.println("a:" + a + "\n" + "b:" + b);
        c = null;
        System.out.println(c);
        //To mark object as Eligible for GC
            //1. assign variable to another
            //2. set null value to it.

    }
}
