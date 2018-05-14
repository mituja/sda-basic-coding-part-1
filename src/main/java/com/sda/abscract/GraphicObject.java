package com.sda.abscract;

public abstract class GraphicObject {
    private int x,y;

    public GraphicObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void moveTo (int newX, int newY){
        this.x = newX;
        this.y = newY;
        }

        abstract void draw();
        abstract void resize();

    @Override
    public String toString() {
        return "GraphicObject{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double calculateDistance(GraphicObject o2){
        int x1 = this.x;
        int x2 = o2.x;
        int y1 = this.y;
        int y2 = o2.y;

        double distX =  x2 - x1;
        double distY = y2 - y1;

        return(Math.sqrt(Math.pow(distX, 2) + Math.pow(distY, 2)));
    }
}
