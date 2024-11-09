package constructor;

/**
 * Поля объекта инициализируются в следующем порядке:
 * <p>
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
    static String fieledA = "static field A";

    {
        System.out.print("\n non-static block class A");
    }

    static {
        System.out.print("\n 1");
        System.out.print("\n static block Constructor A");
    }

    A() {
        System.out.print("\n 2");
        System.out.print("\n default Constructor A()");
    }

    A(String str) {
        this();
        System.out.print("\n 3");
        System.out.print("\n Constructor A(String str)");
    }

    {
        System.out.print("\n non-static block class A");
    }
}

class B extends A {
    static {
        System.out.print("\n 4");
        System.out.print("\n static block Constructor B");
    }

    static String fieledB = "static field B";


    B() {
        System.out.print("\n 5");
        System.out.print("\n default Constructor B()");
    }

    B(String str) {
        this();
        System.out.println("\n 6");
        System.out.print("\n Constructor B(String str)");
    }

    {
        System.out.print("\n non-static block class B");
    }
}

class C extends B {
    static {
        System.out.print("\n 7");
        System.out.print("\n static block Constructor C");
    }

    {
        System.out.print("\n 8");
        System.out.print("\n initialization block class B");
    }

    C() {
        super("Hello");
        System.out.print("\n 9");
        System.out.print("\n default Constructor C()");
    }

    {
        System.out.print("\n non-static block class C");
    }

    static String fieledC = "static field C";
}