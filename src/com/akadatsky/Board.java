package com.akadatsky;

import javafx.scene.canvas.GraphicsContext;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private GraphicsContext gc;

    private List<Shape> shapes = new ArrayList<>();

    public Board(GraphicsContext gc) {
        this.gc = gc;
        shapes.add(new Ball(gc, 10, 20));
        shapes.add(new Ball(gc, 100, 20));
        shapes.add(new Ball(gc, 400, 400));
        shapes.add(new Ball(gc, 10, 300));
        shapes.add(new Square(gc, 25, 300));
        shapes.add(new NewFigure(gc,50,50));
    }

    public void move() {
        for (Shape shape : shapes) {
            shape.move();
        }
    }

    public void draw() {
        clean();
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    private void clean() {
        gc.clearRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
    }

}
