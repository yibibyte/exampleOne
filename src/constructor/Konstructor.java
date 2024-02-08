package constructor;

/**
 * Поля объекта инициализируются в следующем порядке:
 *
 * Статические поля класса Parent;
 * Статический блок инициализации класса Parent;
 * Статические поля класса Сhild;
 * Статический блок инициализации класса Child;
 * Нестатические поля класса Parent;
 * Нестатический блок инициализации класса Parent;
 * Конструктор класса Parent;
 * Нестатические поля класса Сhild;
 * Нестатический блок инициализации класса Сhild;
 * Конструктор класса Сhild.
 */
public class Konstructor {
    public static void main(String[] args) {
        C c = new C();

    }
}

class A {
    static {
        System.out.print("1");
    }

    A() {
        System.out.print("2");
    }

    A(String str) {
        this();
        System.out.print("3");
    }
}

class B extends A {
    static {
        System.out.print("4");
    }

    B() {
        System.out.print("5");
    }

    B(String str) {
        this();
        System.out.println("6");
    }
}

class C extends B {
    static {
        System.out.print("7");
    }

    {
        System.out.print("8");
    }

    C() {
        super("Hello");
        System.out.print("9");
    }
}