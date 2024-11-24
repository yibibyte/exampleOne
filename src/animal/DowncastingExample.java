package animal;

public class DowncastingExample {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.eat();

        // Нисходящее приведение
        Dog myDog = (Dog) myAnimal;
        Dog myDog5 = new Dog();

        myDog5.eat();

        myDog.eat();
        myDog.bark();
    }
}
