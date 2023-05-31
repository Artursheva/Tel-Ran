package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
public class PizzaCaloriesCalculator {
    public static void main(String[] args) {
        int initialDiameter = 24;
        int newDiameter = 28;
        int caloriePerSquareCm = 40;

        int initialCalories = calculateCalories(initialDiameter, caloriePerSquareCm);
        int newCalories = calculateCalories(newDiameter, caloriePerSquareCm);

        int extraCalories = newCalories - initialCalories;

        System.out.println("Дополнительно съедено калорий: " + extraCalories);
    }

    public static int calculateCalories(int diameter, int caloriePerSquareCm) {
        double radius = diameter / 2.0;
        double area = Math.PI * Math.pow(radius, 2);
        int calories = (int) (area * caloriePerSquareCm);
        return calories;
    }
}
