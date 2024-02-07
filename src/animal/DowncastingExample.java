package animal;

public class DowncastingExample {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.eat();

        // Нисходящее приведение
        Dog myDog = (Dog) myAnimal;
        myDog.eat();
        myDog.bark();
    }
}
