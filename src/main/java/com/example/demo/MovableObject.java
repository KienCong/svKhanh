package com.example.demo;

public abstract class MovableObject extends GameObject{

    private double dx = 1, dy = 1; //toc do di chuyen theo truc toa do.

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
        this.setX(getX() + dx * dt);
        this.setY(getY() + dy * dt);
    }
}
