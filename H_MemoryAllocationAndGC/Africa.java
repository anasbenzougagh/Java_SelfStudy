package H_MemoryAllocationAndGC;

public class Africa {
    public static void main(String[] args) {
        Continent continent1 = new Continent("Country","State","City","Town");
        System.out.println(continent1);
        //after declaring, the declared local variables are set in the heap
    }
}
