import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public int a = 123;
    public static int ant = 123;
    public static void main(String[] args) {

//        Person person = new Person("Ivan");
//        Person personIvan = new Person();
//        Client clientOne = new Client();
//        Client client2 = new Client();
//        Client client3 = new Client("Petter", "Bank", 30);



// Объявление переменных
         int number = 5;
        Integer numInteger = 10;
        String hello;
        String world;
        String c;
        String d;
        ant++;
        hello = "Hello";
        world = " world";
        c = "5 ";
        d = "One";

        System.out.println(hello + world);
        System.out.println("Hello World");
        // Add string "By World"
        System.out.println("By World");


        System.out.println(c + d);

        // Объявление переменных примитивных типов
        byte b = (byte) 128;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;
        float f = 3.14f;
        double numDouble = 1.414213562373095048801688724209698078569671875D;
        String symbol = "a ";
        boolean b1 = true;
        boolean b2 = false;

        // Вывод значений переменных
        System.out.println("b = " + b);
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("c = " + c);
        System.out.println("b1 = " + b1);
        System.out.println(symbol);


//        byte  	2^8 		от -128 до 0, 127 , 0 в java считается положительным числом
//        short	2^16		от -32768 до +32767
//        char 	2^16 		хранит в себе символы в кодировке UTF-16 в диапозоне от 0 до 65536
//        int 	2^32
//        long	2^64
//
//        float 	min = 1.45E-45 max = 3.4028235E38 или 1.45*10-45
//        double min = 4.9E-324 max = 1.7976931348623157E308
//
//        boolean true | false  нет никаких 0 и 1

//        byte myByte = 127;
//        int myInt = 128;
//        char myChar = 1000;  // и у нас выведит символ знак бесконечности в перевернутом виде и это будте символ, а не число!
//
//        char symbolChar = 'a';
//
//        char hexChar = '\u33FF';
//        boolean myBoolean = true;
//
//        System.out.println(symbolChar );


/** Приведения типов  */
// на повышение

        byte myByte = 127;
        int myInt100 = myByte;


        double myDouble = myInt100; // допишется еще .0 то есть 127.0

        float myFloat = myInt100; // тоже самое


// понижение

/*
        int myInt100 = 100;
        byte myByte = myInt100; // будет ошибка , нужно привести с должному виду явно, то есть сделать Class casting

        byte myByte = (byte) myInt; 100 – 266 = -156

       // если взять float и привести его к int то просто урезается десятичная часть и в итоге получим только целое число
*/

/** Wrappers  Автоупаковк и Автораспаковка*/

        Integer myInteger = null;
        int myInt1000 = 1000;




        // Объявление переменных

         int a = 10;
/*
//         int b = 20;

         // Вычисление
         int c = a + b;
         int d = a - b;
         int e = a * b;
         int f = a / b;

         // Вывод результатов
         System.out.println("c = " + c);
         System.out.println("d = " + d);
         System.out.println("e = " + e);
         System.out.println("f = " + f);

*/


/*
// Объявление переменных ссылочных типов

        String s = "Hello, world!";
        Double d3;
        Float f1;

        Class c = String.class;
        Object o = new Object();
        int[] a = new int[10];
        Date d = new Date();
        File f = new File("myfile.txt");
        List<String> l = new ArrayList<>();
        Map<String, Integer> m = new HashMap<>();

        // Вывод значений переменных
        System.out.println("s = " + s);
        System.out.println("c = " + c);
        System.out.println("o = " + o);
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("d = " + d);
        System.out.println("f = " + f);
        System.out.println("l = " + l);
        System.out.println("m = " + m);
*/


// Объявление переменных

/*        String s = "Hello, world!";
        int[] a = new int[10];
        Date d = new Date();

        // Работа с объектом String
        System.out.println("Длина строки: " + s.length());
        System.out.println("Первый символ строки: " + s.charAt(0));
        System.out.println("Строка в верхнем регистре: " + s.toUpperCase());
        */

        // Создание объекта Light с параметрами
        System.out.println("Creating Light object no. 1.");
        Light light1 = new Light();                              // (5)
        System.out.println("Creating Light object no. 2.");
        Light light2 = new Light(250, true);                     // (6)
        System.out.println("Creating Light object no. 3.");
        Light light3 = new Light(250, true, "attic");            // (7)


// Работа с массивом int
/*
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        System.out.println("Массив: " + Arrays.toString(a));

        // Работа с объектом Date
        System.out.println("Текущее время: " + d);
    }*/


// Описание операций
/*

        Операции сравнения:
            == - равно
            != - не равно
            > - больше
            < - меньше
            >= - больше или равно
            <= - меньше или равно

            Операции арифметики:
            + - сложение
            - - вычитание
            * - умножение
            / - деление
            % - остаток от деления

            Операции логические:
            && - логическое И
            || - логическое ИЛИ
            ! - логическое НЕ

            Операции присваивания:
            =

            Операции повышения и понижения типа:
            byte, short, char могут быть неявно преобразованы в int
            int может быть неявно преобразован в long
            float может быть неявно преобразован в double
            char может быть неявно преобразован в int

            Операции преобразования типа:
            (byte) - явное преобразование в byte
            (short) - явное преобразование в short
            (char) - явное преобразование в char
            (int) - явное преобразование в int
            (long) - явное преобразование в long
            (float) - явное преобразование в float
            (double) - явное преобразование в double
         */

/*


        try {
            int x = 5;
            int y = x / 0;

        } catch (ArithmeticException e) {
            System.out.println(e);
        }


        int i = (int) (Math.random() * 100 + 1);

        System.out.println("Загрузка мощности:" + i + " %");

        String name;
        int mathematics;
        int physics;
        int english;

        public String greeting() {
            String stroka = name + ", поздравляем, Вы написали экзамены";
            return stroka;
        }

        public double midleMark() {
            double d = ((double) mathematics + (double) physics + (double) english) / 3;
            return d;
        }

        Double numer1 = new Double(99);
        System.out.println(numer1);
        Double numer2 = 5.666666666;
        System.out.println(numer2);
        double a1 = numer1.doubleValue();
        System.out.println(a1);
        double a2 = numer2;
        System.out.println(a2);

        ArrayList<Object> array1 = new ArrayList<Object>();
        transport.Car car1 = new transport.Car("KIA");
        array1.add(car1);
        array1.add(numer1);
        array1.add(numer2);
        array1.add(a1);
        System.out.println(array1.toString());

        Print print = new Print();
        List list= Arrays.asList("first step", null, "second step");

        for (String s:list) {
            try {
                print.print(s);
            }
            catch (NullPointerException e) {
                System.out.println(e.getMessage());
                System.out.println("Exception was processed. Program continues");
            }
            finally {
                System.out.println("Inside bloсk finally");
            }
            System.out.println("Go program....");
            System.out.println("-----------------");
        }
*/

//Операции с примитивными типами:
/*

        // Пример операции сравнения
        int a = 10;
        int b = 20;

        if (a == b) {
            System.out.println("a равно b");
        } else {
            System.out.println("a не равно b");
        }

        // Пример операции арифметики
        int c = a + b;

        System.out.println("c = " + c);

        // Пример операции логического И
        boolean d = true;
        boolean e = false;

        if (d && e) {
            System.out.println("d и e равны true");
        } else {
            System.out.println("d или e равны false");
        }

        // Пример операции присваивания
        int f = 10;

        f = 20;

        System.out.println("f = " + f);

        // Пример операции повышения типа
        byte g = 10;

        int h = g;

        System.out.println("h = " + h);

        // Пример операции понижения типа
        int i = 100;

        byte j = (byte) i;

        System.out.println("j = " + j);

        // Пример операции преобразования типа
        double k = 10.5;

        int l = (int) k;

        System.out.println("l = " + l);

         */


//        Person tom = new Person("Tom");
//        tom.display();
//        Person sam = new compare.Employee("Sam", "Oracle");
//        sam.display();
//        Person bob = new Client("Bob", "DeutscheBank", 3000);
//        bob.display();

// Exception
/*
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Username\\Desktop\\test.txt"));

            String firstString = reader.readLine();
            System.out.println(firstString);
        } catch (FileNotFoundException e) {

            System.out.println("Ошибка! Файл не найден!");
        }

 */

// Циклы
/*
        // Цикл for для вывода чисел от 1 до 5:
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
}
        // Цикл while для подсчета суммы чисел от 1 до 10:
        int sum = 0;
        int i = 1;

        while (i <= 10) {
            sum += i;
            i++;
        }
*/

// Цикл do-while для ввода чисел с клавиатуры, пока не будет введен 0:

/*
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Введите число (введите 0 для завершения): ");
            number = scanner.nextInt();
            System.out.println("Вы ввели: " + number);
        } while (number != 0);

         */

        // Цикл for-each для вывода элементов массива:
/*

        int[] numbers = {10, 20, 30, 40, 50};

        for (int num : numbers) {
            System.out.println(num);

 */

//        Вложенные циклы для создания матрицы:
/*

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }


        // или


        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
*/


//        Пример с циклом do-while и условием выхода:
/*

        int sum = 0;
        int number;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Введите число (введите 0 для завершения): ");
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("Сумма введенных чисел: " + sum);

*/

//        Пример с циклом while и оператором break:

/*
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 6;
        int i = 0;

        while (i < numbers.length) {
            if (numbers[i] == target) {
                System.out.println("Число " + target + " найдено!");
                break;
            }
            i++;
        }*/


    }
}
