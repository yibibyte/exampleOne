package stat;

// Импортирование статического метода без указания имени класса
import static java.lang.Math.pow;

public class MathOperations {
    // Статический метод для сложения двух чисел
    static int add(int a, int b) {
        return a + b;
    }

    // Статический блок
    static {
        // Статический блок выполняется при загрузке класса
        System.out.println("Этот текст выводится при загрузке класса");
    }

    public static void main(String[] args) {


        // Можно вызвать статический метод без создания экземпляра класса
        int result = MathOperations.add(5, 3);
        System.out.println("Сумма: " + result);


//        // Использование статического метода без указания класса
//        double result = pow(2, 3);
//        System.out.println("2 в степени 3 равно: " + result);

    }
}
