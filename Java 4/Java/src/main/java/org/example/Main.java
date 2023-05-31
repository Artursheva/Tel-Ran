package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
public class Converter {
    public static void convertToKelvin(double celsius) {
        double kelvin = celsius + 273.15;
        System.out.println(celsius + " градусов Цельсия = " + kelvin + " Кельвин");
    }

    public static void convertToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " градусов Цельсия = " + fahrenheit + " Фаренгейт");
    }

    public static double convertToKelvinReturn(double celsius) {
        return celsius + 273.15;
    }

    public static double convertToFahrenheitReturn(double celsius) {
        return (celsius * 9/5) + 32;
    }
}
public class Main {
    public static void main(String[] args) {
        double celsius = 25;

        Converter.convertToKelvin(celsius); // Выводит "25 градусов Цельсия = 298.15 Кельвин"
        Converter.convertToFahrenheit(celsius); // Выводит "25 градусов Цельсия = 77.0 Фаренгейт"

        double kelvin = Converter.convertToKelvinReturn(celsius);
        System.out.println("Кельвин: " + kelvin); // Выводит "Кельвин: 298.15"

        double fahrenheit = Converter.convertToFahrenheitReturn(celsius);
        System.out.println("Фаренгейт: " + fahrenheit); // Выводит "Фаренгейт: 77.0"
    }
}
