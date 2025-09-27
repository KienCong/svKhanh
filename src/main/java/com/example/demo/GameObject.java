package com.example.demo;

import javafx.scene.canvas.GraphicsContext;

public abstract class GameObject {
    private double x,y, width, height;

    public GameObject(double x, double y, double width, double height) {
      this.x = x;
      this.y = y;
      this.width = width;
      this.height = height;
   }
   public GameObject() {
      this.x = 0;
      this.y = 0;
      this.width = 0;
      this.height = 0;
   }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public abstract void update(double dt);
    public abstract void render(GraphicsContext gc);
}
