package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
public class Box {
    private double width;
    private double height;
    private double length;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public void calculateVolumeAndPrint() {
        double volume = width * height * length;
        System.out.println("Объем коробки: " + volume);
    }
}
public class Main {
    public static void main(String[] args) {
        Box myBox = new Box(10, 5, 2);
        myBox.calculateVolumeAndPrint(); // Выводит "Объем коробки: 100.0" в консоль
    }
}

