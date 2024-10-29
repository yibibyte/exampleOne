public class Main {
    public int a = 123;
    public static int ant = 123;

    public static void main(String[] args) {

        boolean isActive = true;
        Boolean isActive2 = false;

        Integer numberOne = 1;
        System.out.println("isActive=" + numberOne + isActive +isActive2);

        boolean isAlive = true;
        System.out.println("isActive=" + isActive);
        System.out.println("isAlive=" + isAlive);

        //boolean true | false  нет никаких 0 и 1
        //boolean true | false  нет никаких 0 и 1
        //boolean true | false  нет никаких 0 и 1
        //boolean true | false  нет никаких 0 и 1
        //boolean true | false  нет никаких 0 и 1
        //boolean true | false  нет никаких 0 и 1
        //boolean true | false  нет никаких 0 и 1

        byte a = 127;

        byte b = 6;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("a + b=" + (a + b));

        short aa = 7;
        short bb = 8;
        System.out.println("aa=" + aa);
        System.out.println("bb=" + bb);
        System.out.println("aa+ bb=" + (aa + bb));

        int num1 = 123;
        int num2 = 456;
        System.out.println("num1=" + num1);
        System.out.println("num2=" + num2);
        System.out.println("num1+num2=" + (num1 + num2));

        long number1 = 5;
        long number2 = 6;
        long summaryNums = number1 + number2;
        System.out.println("summaryNums=" + summaryNums);

        double x = 4.;
        double y = 7.8;
        System.out.println("x=" + x + "; y=" + y);

        float xx = 9.5F;
        float yy = 5.7F;
        System.out.println("xx" + xx + "; yy=" + yy);

        int xxx = 123_456;
        int yyy = 234_567__789;
        System.out.println(xxx);  // 123456
        System.out.println(yyy);  // 234567789

        float fl = 42.6f;
        double db = 43.7;
        System.out.println("fl== " + fl + "; db = " + db);

        char ch = 65; // символ 'A'
        System.out.println("ch = " + ch);

        char myChar = 1000;  // выведит символ знак бесконечности в перевернутом виде и это будте символ, а не число!
        System.out.println(myChar);

        char symbolChar = 'a';
        System.out.println(symbolChar);

        char hexChar = '\u33FF';
        System.out.println(hexChar);

        String hello = "Hello world";
        System.out.println(hello);

        String textHelloWorld = "Hello \n world\n";
        System.out.println(textHelloWorld);

        String PushkinPoems = "Уж небо осенью дышало,\n" +
                "Уж реже солнышко блистало,\n" +
                "Короче становился день,\n" +
                "Лесов таинственная сень\n" +
                "С печальным шумом обнажалась,\n" +
                "Ложился на поля туман,\n" +
                "Гусей крикливых караван\n" +
                "Тянулся к югу: приближалась\n" +
                "Довольно скучная пора;\n" +
                "Стоял ноябрь уж у двора.\n" +
                "\n";
        System.out.println(PushkinPoems);

        // Появилась с 15 версией Java
        String PushkinPoemsBegin15version = """
                Уж небо осенью дышало,
                Уж реже солнышко блистало,
                Короче становился день,
                Лесов таинственная сень
                С печальным шумом обнажалась,
                Ложился на поля туман,
                Гусей крикливых караван
                Тянулся к югу: приближалась
                Довольно скучная пора;
                Стоял ноябрь уж у двора.
                """;
        System.out.println(PushkinPoems);

        System.out.println("x=" + x + "; y=" + y);

        //%x: для вывода шестнадцатеричных чисел
        //%f: для вывода чисел с плавающей точкой
        //%e: для вывода чисел в экспоненциальной форме, например, 1.3e+01
        //%c: для вывода одиночного символа
        //%s: для вывода строковых значений

        // Пример для %x: для вывода шестнадцатеричных чисел
        int number = 255;
        System.out.printf("Шестнадцатеричное представление числа %d: %x\n", number, number);

        // Пример для %f: для вывода чисел с плавающей точкой
        double floatNumber = 123.456789;
        System.out.printf("Число с плавающей точкой: %.2f\n", floatNumber); // Ограничение до 2 знаков после запятой

        // Пример для %e: для вывода чисел в экспоненциальной форме
        double scientificNumber = 123456789.0;
        System.out.printf("Экспоненциальная форма: %.2e\n", scientificNumber); // Ограничение до 2 знаков после запятой

        // Пример для %c: для вывода одиночного символа
        char character = 'A';
        System.out.printf("Одиночный символ: %c\n", character);

        // Пример для %s: для вывода строковых значений
        String text = "Привет, мир!";
        System.out.printf("Строка: %s\n", text);


        //        Person person = new Person("Ivan");
        //        Person personIvan = new Person();
        //        Client clientOne = new Client();
        //        Client client2 = new Client();
        //        Client client3 = new Client("Petter", "Bank", 30);


        // Объявление переменных

        Integer numInteger = 10;
        String Hello;
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
        System.out.println("By World");

        System.out.println(c + d);

        // Объявление переменных примитивных типов
        byte varByte = (byte) 128;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;
        float f = 3.14f;
        double numDouble = 1.414213562373095048801688724209698078569671875D;
        String symbol = "a ";
        boolean var = true;
        boolean b2 = false;

        // Вывод значений переменных
        System.out.println("b1 = " + varByte);
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("c = " + c);
        System.out.println("b2 = " + b2);
        System.out.println(symbol);


//        float min = 1.45E-45 max = 3.4028235E38 или 1.45*10-45
//        double min = 4.9E-324 max = 1.7976931348623157E308


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

/*
           int a = 10;
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

        int x = 0;
        x = x + 1; // x = 0 + 1 => x = 1
        x = x + 1; // x = 1 + 1 => x = 2
        x = x + 1; // x = 2 + 1 => x = 3
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

