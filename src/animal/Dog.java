package animal;

public class Dog extends Animal{
    @Override
    String go() {
        return "dog go";
    }

    void makeSound() {
        System.out.println("Woof woof");
    }
    void bark() {
        System.out.println("Dog is barking");
    }
}
