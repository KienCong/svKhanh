package com.example.demo;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;

public class Renderer {
     private GraphicsContext gc;
     private Canvas canvas;
     public Renderer(GraphicsContext gc, Canvas canvas) {
         this.gc = gc;
         this.canvas = canvas;
     }
     public void DrawPaddle(Paddle obj) {
         obj.render(gc);
     }
    public void DrawBall(Ball obj) {
         obj.bounceOffWalls(canvas.getWidth(), canvas.getHeight());
         obj.render(gc);
    }
}
