package constructor;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Barsik");
        Animal animal2 = new Animal("Barsik2");
        Animal animal3 = new Animal("Barsik3");
        Animal animal4 = new Animal("Barsik4");

        animal.bark();

        System.out.println("");

        Dog dog = new Dog("Bobik", 10, "Grey");
        dog.bark();

        System.out.println("Count Constructor Animal: " + Animal.cout);
        System.out.println("");

        System.out.println("Count Constructor Dog: " + Dog.cout);
    }
}
