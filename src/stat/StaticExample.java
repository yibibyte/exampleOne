package stat;
import static java.lang.Math.PI;

public class StaticExample {

    // Статическая переменная, принадлежит классу, а не экземпляру
    public static int staticVariable = 10;

    private static int count = 0;

    public StaticExample() {
        count++;
    }
    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {

        StaticExample example = new StaticExample();
        StaticExample example2 = new StaticExample();
        StaticExample example3 = new StaticExample();

        System.out.println(getCount());

        StaticExample.getCount();
        int staticVariable1 = StaticExample.staticVariable;

        System.out.println(PI);


        // Можно получить доступ к статической переменной без создания экземпляра класса
        System.out.println(StaticExample.staticVariable);

        // Изменение статической переменной
        StaticExample.staticVariable = 20;

        // Теперь значение изменено для всех экземпляров класса
        System.out.println(StaticExample.staticVariable);
    }
}
