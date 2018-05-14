package com.sda.abscract;

public class Rectangle extends GraphicObject {

    public Rectangle(int x, int y) {
        super(x, y);
    }

    @Override
    void draw() {
        System.out.println("draw rectangle");
    }

    @Override
    void resize() {
        System.out.println("resize rectangle");
    }




}
