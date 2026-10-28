package O_OPPConcepts.A_Encapculation;

import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    private char gender;
    private ArrayList<String> language;

    private static String planet;
    private static boolean isHuman, hasNose;
    private static int numberOfWings, numberOfHeads;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public ArrayList<String> getLanguage() {
        return language;
    }

    public void setLanguage(ArrayList<String> language) {
        this.language = language;
    }

    public static String getPlanet() {
        return planet;
    }

    public static void setPlanet(String planet) {
        Person.planet = planet;
    }

    public static boolean isIsHuman() {
        return isHuman;
    }

    public static void setIsHuman(boolean isHuman) {
        Person.isHuman = isHuman;
    }

    public static boolean isHasNose() {
        return hasNose;
    }

    public static void setHasNose(boolean hasNose) {
        Person.hasNose = hasNose;
    }

    public static int getNumberOfWings() {
        return numberOfWings;
    }

    public static void setNumberOfWings(int numberOfWings) {
        Person.numberOfWings = numberOfWings;
    }

    public static int getNumberOfHeads() {
        return numberOfHeads;
    }

    public static void setNumberOfHeads(int numberOfHeads) {
        Person.numberOfHeads = numberOfHeads;
    }



    public Person(String name, int age, char gender, ArrayList<String> language) {
        setName(name);
        setAge(age);
        setGender(gender);
        setLanguage(language);
    }
    static {
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfWings = 0;
        numberOfHeads = 1;
    }


    public String toString() {
        return getClass().getSimpleName() + "\n"+
                "Name: " + name +
                "\nAge: " + age +
                "\nGender: " + gender +
                "\nLanguage: " + language
                ;
    }
}
