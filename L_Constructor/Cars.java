package L_Constructor;

import java.util.ArrayList;

public class Cars {
    String make, model, color;
    int year;
    double price;
    ArrayList<String> keyType;

    public Cars(String make){
        this.make = make;
    }
    public Cars(String make ,String model){
        this(make);
        this.model = model;
    }
    public Cars(String make ,String model , String color){
        this(make , model);
        this.color = color;
    }
    public Cars(String make ,String model , String color, int year){
        this(make , model, color);
        this.year = year;
    }
    public Cars(String make ,String model , String color, int year, double price){
        this(make , model, color, year);
        this.price = price;
    }

    public Cars(String make ,String model , String color, int year, double price,  ArrayList keyType){
        this(make , model, color, year,price);
        this.keyType = keyType;
    }


    public String toString() {
        return ("Make: " + make + "\n" +
                "Model: " + model + "\n" +
                "Color: " + color + "\n" +
                "Year: " + year + "\n" +
                "Price: $" + price + "\n" +
                "Key Type: " + keyType
        );

    }
}

