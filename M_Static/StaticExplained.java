package M_Static;

public class StaticExplained {
    /*We use static to take one slot of heap memory, unlike instances
    that will take memory as long as they’re declared. We use instance,
    so we can have different variables with different storing data.*/

    static String brand;
    String model;

    static {
        brand="Iphone";
    }

    public StaticExplained(String model) {
        this.model = model;
    }

    public String toString() {
        return "Brand: " + brand + " \nModel: " + model;
    }

    public static void main(String[] args) {
        StaticExplained phone = new StaticExplained("14 PRO MAX");
        System.out.println(phone);
    }
}
