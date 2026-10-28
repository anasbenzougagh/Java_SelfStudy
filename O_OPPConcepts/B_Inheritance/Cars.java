package O_OPPConcepts.B_Inheritance;

import java.util.ArrayList;

public class Cars {
    //Inheritance is having access to the superclass attributes.
    private String make,model,color;
    private int year;
    private double price;
    private ArrayList<String> ignitionType;

    public String getMake() {
        return getClass().getSimpleName();
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayList<String> getIgnitionType() {
        return ignitionType;
    }

    public void setIgnitionType(ArrayList<String> ignitionType) {
        this.ignitionType = ignitionType;
    }

    public Cars(String make, String model, String color, int year, double price, ArrayList<String> ignitionType) {
        setMake(make);
        setModel(model);
        setColor(color);
        setYear(year);
        setPrice(price);
        setIgnitionType(ignitionType);
    }

    public void isCar(){
        System.out.println("True");
    }

    @Override
    public String toString() {
        return "Cars{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", ignitionType=" + ignitionType +
                '}';
    }
}
