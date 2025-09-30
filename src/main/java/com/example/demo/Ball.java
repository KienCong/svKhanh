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
       return (this.getX() + this.getWidth() > other.getX() &&
               this.getX() - this.getWidth()  < other.getX() + other.getWidth() &&
               this.getY() + this.getHeight()  > other.getY() &&
               this.getY() - this.getHeight()  < other.getY() + other.getHeight());
    }

    public void bounceoOffPaddle(GameObject other) {
        if (checkCollision(other)) {
            this.setY(other.getY() - this.getHeight()); // đặt bóng lên trên paddle
            this.setDy(-Math.abs(this.getDy())); // đảo chiều Y lên trên

            // Tính góc bật
            double paddleCenter = other.getX() + other.getWidth() / 2.0;
            double ballCenter = this.getX() + this.getWidth() / 2.0;
            double hitPos = (ballCenter - paddleCenter) / (other.getWidth() / 2.0);

            double angle = hitPos * 60; // lệch tối đa ±60 độ
            double speed = Math.sqrt(this.getDx() * this.getDx() + this.getDy() * this.getDy());

            double newDx = speed * Math.sin(Math.toRadians(angle));
            double newDy = -speed * Math.cos(Math.toRadians(angle));
            this.setDx(newDx);
            this.setDy(newDy);
        }
    }
    public void bounceOffWalls(double canvasWidth, double canvasHeight) {
        double radius = this.getWidth();
        move(1);
        if (getX() - radius < 0) {
            this.setX(radius);
            double dx = -this.getDx();
            this.setDx(dx);
        }
        if (getX() + radius > canvasWidth) {
            this.setX(canvasWidth - radius);
            this.setDx(-getDx());
        }
        if (getY() - radius < 0) {
            this.setY(radius);
            double dy = -this.getDy();
            this.setDy(dy);
        }
        if (getY() + radius > canvasHeight) {
            this.setY(canvasHeight -radius);
            double dy = -this.getDy();
            this.setDy(dy);
        }
    }
}
