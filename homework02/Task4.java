package main.java.com.homework2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите необходимый для таблицы символ: ");
        String symbol = scanner.nextLine();
        System.out.print("Введите необходимое число строк таблицы: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите необходимое число столбцов таблицы: ");
        int num2 = scanner.nextInt();
        for (int i = 1; i <= num1; i++) {
            var s = symbol.repeat(num2);
                System.out.println(s); }
    }
}
