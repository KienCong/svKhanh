package com.example.demo;

public abstract class MovableObject extends GameObject{

    private double dx, dy; //toc do di chuyen theo truc toa do.

    public MovableObject(double x, double y, double width, double height) {
        super(x, y, width, height);
    }

    public MovableObject() {

    }

    public double getDx() {
        return dx;
    }

    public void setDx(double dx) {
        this.dx = dx;
    }

    public double getDy() {
        return dy;
    }

    public void setDy(double dy) {
        this.dy = dy;
    }

    public void move(double dt) {
        this.setX(dx * dt);
        this.setY(dy * dt);
    }
}
