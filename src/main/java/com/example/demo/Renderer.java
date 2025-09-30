package com.example.demo;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;

public class Renderer {
     private GraphicsContext gc;
     private Canvas canvas;
     private Paddle paddle;
     public Renderer(GraphicsContext gc, Canvas canvas, Paddle paddle) {
         this.gc = gc;
         this.canvas = canvas;
         this.paddle = paddle;
     }
     public void DrawPaddle(Paddle obj) {
         obj.render(gc);
     }
    public void DrawBall(Ball obj) {
        obj.bounceOffWalls(canvas.getWidth(), canvas.getHeight());
        obj.bounceoOffPaddle(paddle);
        obj.render(gc);
    }
    public void DrawBrick(Brick brick)
    {
        brick.render(gc);
    }
}
