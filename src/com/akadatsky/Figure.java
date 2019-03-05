package com.akadatsky;

import javafx.scene.canvas.GraphicsContext;

import java.util.Random;

public abstract class Figure implements Shape {
    protected static double DIAMETER = 30;

    protected GraphicsContext gc;
    protected double x;
    protected double y;

    protected double xSpeed;
    protected double ySpeed;

    public Figure(GraphicsContext gc, double x, double y) {
        this.gc = gc;
        this.x = x;
        this.y = y;

        Random random = new Random();
        xSpeed = 2 + random.nextInt(5);
        ySpeed = 2 + random.nextInt(5);
    }

    @Override
    public void move() {
        x += xSpeed;
        y += ySpeed;

        if (x + DIAMETER > gc.getCanvas().getWidth()) {
            xSpeed = -xSpeed;
        }

        if (y + DIAMETER > gc.getCanvas().getHeight()) {
            ySpeed = -ySpeed;
        }

        if (x < 0) {
            xSpeed = -xSpeed;
        }

        if (y < 0) {
            ySpeed = -ySpeed;
        }

    }

}
