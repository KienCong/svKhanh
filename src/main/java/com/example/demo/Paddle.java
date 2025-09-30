package com.example.demo;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Paddle extends MovableObject {

    private final double speed = 20;
    public Paddle(double x, double y, double width, double height) {
        super(x, y, width, height);
    }

    @Override
    public void update(double dt) {
     
    }

    @Override
    public void render(GraphicsContext gc) {
        Image paddleImg = new Image("E:\\N3_K1\\LapTrinhHuongDoiTuong\\bigProject\\demo\\src\\main\\resources\\image\\paddle.png");
        gc.drawImage(paddleImg,getX(),getY(),getWidth(),getHeight());
         //gc.setFill(Color.BLUE);
        // gc.fillRect(getX(),getY(),getWidth(),getHeight());

    }
    public void moveLeft() {
          this.setX(this.getX() - speed);

    }
    public void moveRight() {
        this.setX(this.getX() + speed);
    }

}
