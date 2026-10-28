package E_Methods;

public class E_Overriding {
    public static class Animal {
        void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }

    public static class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Dog barks");
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.makeSound();
        dog.makeSound();
    }

}

