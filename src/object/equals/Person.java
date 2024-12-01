package object.equals;

import java.util.Objects;

/**
 * equals(Object obj) метод используется для сравнения объектов на равенство.
 * По умолчанию он сравнивает ссылки на объекты, но обычно его переопределяют,
 * чтобы сравнивать содержимое объектов.
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
        if (this == obj) return true; // Сравнение с самим собой
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age); // Генерация хэш-кода
    }
}
