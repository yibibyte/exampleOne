package animal;

public class LateBindingExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Позднее связывание
        myDog.makeSound();  // Вызывается метод makeSound() из класса Dog
        myCat.makeSound();  // Вызывается метод makeSound() из класса Cat
    }
}
