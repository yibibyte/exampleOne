package animal;

public class UpcastingExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat(); // Метод из Animal доступен
        myDog.bark();

        Animal myAnimal = myDog; // Восходящее приведение
        myAnimal.eat(); // Метод из Animal доступен, хотя ссылка типа Animal
        // myAnimal.bark(); // Ошибка компиляции, так как метод bark() отсутствует в Animal
    }
}
