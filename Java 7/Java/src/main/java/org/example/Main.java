package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
import java.util.Scanner;

public class WeekdayConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число от 1 до 7: ");
        int number = scanner.nextInt();

        if (number >= 1 && number <= 7) {
            String weekday = convertToWeekday(number);
            System.out.println(weekday);
        } else {
            System.out.println("Введено некорректное значение.");
        }
    }

    public static String convertToWeekday(int number) {
        String weekday;

        switch (number) {
            case 1:
                weekday = "Monday";
                break;
            case 2:
                weekday = "Tuesday";
                break;
            case 3:
                weekday = "Wednesday";
                break;
            case 4:
                weekday = "Thursday";
                break;
            case 5:
                weekday = "Friday";
                break;
            case 6:
                weekday = "Saturday";
                break;
            case 7:
                weekday = "Sunday";
                break;
            default:
                weekday = "Некорректное значение";
                break;
        }

        return weekday;
    }
}
