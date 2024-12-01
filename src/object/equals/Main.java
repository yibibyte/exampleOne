package object.equals;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);
        System.out.println(person1.equals(person2)); // Вывод: true

    }
}
