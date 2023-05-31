package org.example;

import jdk.incubator.vector.VectorOperators;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
public class CharToIntUsingString {
    public static void main(String[] args) {
        char c = '4';
        String charString = String.valueOf(c);
        int result = Integer.parseInt(charString);
        int finalResult = result + 6;
        System.out.println(finalResult);
    }
}
public class CharToIntUsingCharacter {
    public static void main(String[] args) {
        char c = '4';
        int result = Character.getNumericValue(c);
        int finalResult = result + 6;
        System.out.println(finalResult);
    }
}
