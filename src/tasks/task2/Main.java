package tasks.task2;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        double y = 3.14;
        boolean z = true;
        String str = "Hello, world!";
        Integer integer = x;

        // Прибавьте к переменной x значение переменной y.
        x += y;

        // Вычтите из переменной x значение переменной z.
        x -= z ? 1 : 0;

        // Умножьте переменную y на значение переменной integer.
        y *= integer;

        // Разделите переменную x на значение переменной y.
        x /= y;

        // Остаток от деления переменной x на значение переменной y.
        x %= y;

        // Выведите на экран результаты выполнения этих действий.
        System.out.println("x + y = " + (x + y));
        //System.out.println("x - z = " + (x - z));
        System.out.println("y * integer = " + (y * integer));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));
    }

}
