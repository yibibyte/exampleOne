package stat;
import static java.lang.Math.PI;

public class StaticExample {

    // Статическая переменная, принадлежит классу, а не экземпляру
    public static int staticVariable = 10;

    public static final int CONSTANT_VAR = 1024;;

    private static int count = 0;
    private int count22 = 0;

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
        StaticExample example4 = new StaticExample();
        StaticExample example5 = new StaticExample();
        StaticExample example6 = new StaticExample();
        StaticExample example7 = new StaticExample();

        System.out.println(getCount());

//        StaticExample.getCount();
//        int staticVariable1 = StaticExample.staticVariable;
//
//        System.out.println(PI);
//
//
//        // Можно получить доступ к статической переменной без создания экземпляра класса
//        System.out.println(StaticExample.staticVariable);
//
//        // Изменение статической переменной
//        StaticExample.staticVariable = 20;
//
//        // Теперь значение изменено для всех экземпляров класса
//        System.out.println(StaticExample.staticVariable);
    }
}
