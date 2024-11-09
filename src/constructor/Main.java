package constructor;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.bark();

        System.out.println("");

        Dog dog = new Dog("dog", 10, "Grey");
        dog.bark();

        System.out.println("");

        System.out.println("Count Constructor Dog: " + Dog.cout);
        System.out.println("Count Constructor Animal: " + Animal.cout);
    }
}
