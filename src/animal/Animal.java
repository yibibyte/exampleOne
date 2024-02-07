package animal;

public abstract class Animal {
    abstract String go();
    void eat() {
        System.out.println("Animal is eating");
    }
    void makeSound() {
        System.out.println("Some generic sound");
    }
}
