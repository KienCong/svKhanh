package com.example.demo;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;

public class Renderer {
     private GraphicsContext gc;
     public Renderer(GraphicsContext gc) {
         this.gc = gc;
     }
     public void DrawPaddle(Paddle obj) {
         obj.render(gc);
     }
    public void DrawBall(Ball obj) {
         obj.render(gc);
    }
}
