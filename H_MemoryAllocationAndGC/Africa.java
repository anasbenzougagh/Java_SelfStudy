package H_MemoryAllocationAndGC;

public class Africa {
    public static void main(String[] args) {
        Continent continent1 = new Continent("Morocco","Tafilalt","Errachidia","Ain El Atti");
        System.out.println(continent1);
        //after declaring, the declared local variables are set in the heap
    }
}