package object.getclass;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice");
        System.out.println(person.getClass().getName()); // Вывод: Person
    }
}
