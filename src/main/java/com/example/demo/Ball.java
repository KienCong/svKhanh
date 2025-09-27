package com.example.demo;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class Ball extends MovableObject{
    private double speed;
    private double directionX;
    private double directionY;
    public double getDirectionY() {
        return directionY;
    }

    public double getDirectionX() {
        return directionX;
    }


    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setDirectionX(double directionX) {
        this.directionX = directionX;
    }

    public void setDirectionY(double directionY) {
        this.directionY = directionY;
    }


    public Ball(double x, double y, double width, double height) {
        super(x, y, width, height);

    }

    @Override
    public void update(double dt) {

    }

    @Override
    public void render(GraphicsContext gc) {
          //gc.setFill(Color.RED);
         // gc.fillOval(super.getX(), super.getY(), super.getWidth(), super.getHeight());
        Image ballImg = new Image("E:\\N3_K1\\LapTrinhHuongDoiTuong\\bigProject\\demo\\src\\main\\resources\\image\\ball.jpg");
        // Lưu trạng thái ban đầu
        gc.save();

// Tạo vùng clip hình tròn
        double radius = getWidth() / 2.0;
        gc.beginPath();
        gc.arc(getX() + radius, getY() + radius, radius, radius, 0, 360); // (centerX, centerY, radius)
        gc.closePath();
        gc.clip();

// Vẽ ảnh vào trong vùng clip
        gc.drawImage(ballImg, getX(),getY(),getWidth(),getHeight());

// Khôi phục trạng thái gốc (bỏ clip)
        gc.restore();
    }

    public boolean checkCollision(GameObject other) {
        return true;
    }
    public void bounceoOff(GameObject other) {

    }

}
