package com.example.demo;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import java.util.Random;

public class Brick extends GameObject  {
    private int hitPoints;
    private final int type = 1;
    private Color color;

    public Brick(double x, double y, double width, double height) {
        super(x,y,width, height);
        Random random = new Random();
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        color = Color.rgb(r,g, b);
    }
    @Override
    public void update(double dt) {


    }

    @Override
    public void render(GraphicsContext gc) {
           gc.setFill(color);
           gc.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());

    }
}
