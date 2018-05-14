package com.sda.calc;

import com.sda.abscract.Circle;
import com.sda.abscract.GraphicObject;
import com.sda.abscract.Rectangle;

public class AdvancedCalculator extends Calculator {

    public static double pow(double a, double b) {
        return Math.pow(a, b);
    }

    public static double root(double a, double b) {
        return pow(a, 1 / b);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= (Math.sqrt(n) + 1); i++) {
            if (n % i == 0) {
                return false;
            }
        } return true;
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 3));
        System.out.println(root(27, 3));
        System.out.println(isPrime(10));
        System.out.println(add(4.5, 0.2));

        Rectangle rectangle = new Rectangle(0,0);
        Circle circle = new Circle(3,4);

        System.out.println(rectangle.calculateDistance(circle));
    }
}
