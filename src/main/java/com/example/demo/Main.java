package com.example.demo;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    private final int WIDTH = 800;
    private final int HEIGHT = 600;

    @Override
    public void start(Stage primaryStage) {
       Canvas canvas = new Canvas(WIDTH, HEIGHT);
       GraphicsContext gc = canvas.getGraphicsContext2D();
       Renderer renderer = new Renderer(gc);

       Paddle paddle = new Paddle(350, 550, 100,20);
       Ball ball = new Ball(400, 300, 50, 50);
       new GameManager(paddle,ball, canvas);
       StackPane root = new StackPane(canvas);
       Scene scene = new Scene(root);
       primaryStage.setScene(scene);
       primaryStage.setTitle("Arkanoid java");
       primaryStage.show();

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                gc.setFill(Color.BLACK);
                gc.fillRect(0,0, WIDTH, HEIGHT);
               renderer.DrawPaddle(paddle);
               renderer.DrawBall(ball);
            }
        };
      timer.start();

    }

    public static void main(String[] args) {
        launch(args);
    }

}