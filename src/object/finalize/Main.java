package object.finalize;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice");
        person = null; // Очистка ссылки, объект будет уничтожен
        System.gc(); // Явный вызов сборщика мусора (не рекомендуется использовать в реальной жизни)
    }
}
