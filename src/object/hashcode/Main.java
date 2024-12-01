package object.hashcode;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);

        System.out.println(person1.hashCode()); // hashCode: person1
        System.out.println(person2.hashCode()); // hashCode: person2

        System.out.println(person1.hashCode() == person2.hashCode()); // Вывод: true
    }
}