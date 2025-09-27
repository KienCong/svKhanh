package com.example.demo;

import javafx.scene.canvas.Canvas;
import javafx.scene.input.KeyCode;

public class GameManager {
    private Paddle paddle;
    private Ball ball;
    public GameManager(Paddle paddle, Ball ball, Canvas canvas ) {
        this.paddle = paddle;
        this.ball = ball;
        canvas.setFocusTraversable(true);
        canvas.requestFocus();
        canvas.setOnKeyPressed(e->handleKeyPress(e.getCode()));
    }
     private void handleKeyPress(KeyCode code) {
        switch (code) {
            case LEFT -> paddle.moveLeft();
            case RIGHT -> paddle.moveRight();
        }
     }
}
