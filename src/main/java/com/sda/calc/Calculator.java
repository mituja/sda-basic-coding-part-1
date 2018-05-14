package com.sda.calc;

import java.util.Scanner;

public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double substract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static void powers(int basis, int exponent) {

// --- Opcjonalne pobieranie danych z konsoli
//        Scanner input = new Scanner(System.in);
//        System.out.println("Podaj podstawę potęgi: ");
//        int basis = input.nextInt();
//        System.out.println("Podaj wykładnik potęgi: ");
//        int exponent = input.nextInt();

        int result = basis;
        for (int i = 1; i < exponent; i++) {
            result = result * basis;
        }

        System.out.println("Wynik potęgowania: " + result);
    }

    public static void main(String[] args) {
        System.out.println(add(3.5, 1.8));
        System.out.println(substract(3.5, 1.8));
        System.out.println(multiply(3.5, 1.8));
        System.out.println(divide(3.5, 1.8));

        powers(2, 4);

    }
}
