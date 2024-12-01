package object;

/**
 * toString() метод возвращает строковое представление объекта.
 * По умолчанию он возвращает строку, содержащую имя класса и хэш-код объекта.
 * Обычно его переопределяют для предоставления более информативного вывода.
 *
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

}
