package animal;

public class Cat extends Animal {
    @Override
    String go() {
        return "go Cat";
    }

    void makeSound() {
        System.out.println("Meow");
    }
}
