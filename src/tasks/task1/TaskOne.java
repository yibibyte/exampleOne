package tasks.task1;

public class TaskOne {
    public static void main(String[] args) {
        int x = 10;
        double y = 3.14;
        boolean z = true;
        String str = "Hello, world!";

        Integer integerVar = Integer.valueOf(x);
        Double doubleVar = Double.valueOf(y);
        Boolean booleanVar = Boolean.valueOf(z);
        //String string = String.valueOf(str);
        String string = str;

        // Присвоить переменной x значение объекта integerVar;
        x = integerVar;

        // Присвоить переменной y значение объекта doubleVar;
        y = doubleVar;

        // Присвоить переменной z значение объекта booleanVar;
        z = booleanVar;

        // Присвоить переменной str значение объекта stringVar;
        str = string;

        // Вывести значения всех переменных на экран.
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("str = " + str);
    }
}
