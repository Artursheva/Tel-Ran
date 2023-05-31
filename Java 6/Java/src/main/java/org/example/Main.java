package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
import java.util.Random;

public class WorkdayCountdown {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(28801); // Случайное число от 0 до 28800
        System.out.println("Осталось секунд: " + n);

        int hours = n / 3600; // Количество полных часов
        if (hours > 0) {
            System.out.println("Осталось " + hours + " часов");
        } else {
            System.out.println("Осталось менее часа");
        }
    }
}
