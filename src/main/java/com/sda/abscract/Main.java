package com.sda.abscract;

public class Main {
    public static void main(String[] args) {
        //GraphicObject graphicObject = new GraphicObject();
        Rectangle rectangle = new Rectangle(0,0);
        rectangle.moveTo(10,10);

        Circle circle = new Circle(0,0);
        circle.moveTo(20,20);

        System.out.println(rectangle);
        System.out.println(circle);

        System.out.println("Calculated distance is: " + rectangle.calculateDistance(circle));

        circle.draw();
    }
}
