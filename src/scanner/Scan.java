package scanner;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Введите число (введите 0 для завершения): ");
            number = scanner.nextInt();
            System.out.println("Вы ввели: " + number);
        } while (number != 0);
    }
}
