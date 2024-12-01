package object.clone;

/**
 * Метод clone() используется для создания копии объекта.
 * Он возвращает новый объект, который является копией текущего объекта.
 * Чтобы использовать его, класс должен реализовывать интерфейс Cloneable,
 * иначе будет выброшено исключение CloneNotSupportedException.
 */
public class Main {
    public static void main(String[] args) {
        try {

            Person person1 = new Person("Alice", 30);
            Person person2 = person1.clone();

            System.out.println(person1 != person2); // Вывод: true (это разные объекты)
            System.out.println(person1.equals(person2)); // Вывод: true (содержимое одинаково)

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
