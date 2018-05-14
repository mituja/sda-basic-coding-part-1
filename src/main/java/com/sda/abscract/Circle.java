package com.sda.abscract;

public class Circle extends GraphicObject {

    public Circle(int x, int y) {
        super(x,y);
    }

    @Override
    void draw() {
        System.out.println("draw circle");
    }

    @Override
    void resize() {
        System.out.println("resize circle");
    }
}
