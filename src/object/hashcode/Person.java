package object.hashcode;

import java.util.Objects;

/**
 * Метод hashCode() используется для получения хэш-кода объекта,
 * который является числовым представлением объекта.
 * Обычно его переопределяют, если переопределяют метод equals() (чтобы соблюсти контракт между ними:
 * если два объекта равны, их хэш-коды должны быть одинаковыми).
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
