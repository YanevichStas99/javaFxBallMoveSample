package com.akadatsky;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.Random;

public class Square extends Figure {

    public Square(GraphicsContext gc, double x, double y) {
        super(gc, x, y);
    }


    @Override
    public void draw() {
        gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(2);

        gc.fillRect(x, y, DIAMETER, DIAMETER);
        gc.strokeRect(x, y, DIAMETER, DIAMETER);
    }

}
