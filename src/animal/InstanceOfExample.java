package animal;

public class InstanceOfExample {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();

        if (myAnimal instanceof Animal) {
            System.out.println("myAnimal is an instance of Animal"); // возвращает true, так как myAnimal является экземпляром класса Animal.
        }

        if (myAnimal instanceof Dog) {
            System.out.println("myAnimal is an instance of Dog");
            /*
            также возвращает true, так как myAnimal был создан как экземпляр класса Dog. После этой проверки мы
            можем выполнить нисходящее приведение и использовать методы класса Dog.
             */

            /*
            Оператор instanceof полезен, когда вам нужно проверить тип объекта перед выполнением
            некоторых операций, чтобы избежать исключений ClassCastException.
             */

            Dog myDog = (Dog) myAnimal;
            myDog.eat();
            myDog.bark();
        } else {
            System.out.println("myAnimal is not an instance of Dog");
        }
    }
}
