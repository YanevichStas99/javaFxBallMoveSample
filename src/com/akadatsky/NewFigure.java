package com.akadatsky;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


public class NewFigure extends Figure {
    public NewFigure(GraphicsContext gc, double x, double y) {
        super(gc, x, y);
    }

    @Override
    public void draw() {
        gc.setFill(Color.PURPLE);
        gc.setStroke(Color.BLACK);
        gc.fillOval(x,y,120,120);
        gc.strokeOval(x,y,120,120);

        gc.setFill(Color.DARKORANGE);
        gc.setStroke(Color.BLACK);
        double[] xPoints={x+10,x+60,x+110};
        double[] yPoints={y+90,y,y+90};
        gc.fillPolygon(xPoints,yPoints,3);


        //gc.setFill(Color.GOLD);
        //gc.setStroke(Color.BLACK);
        double[] x2Points={x+10,x+60,x+110};
        double[] y2Points={y+30,y+120,y+30};
        gc.fillPolygon(x2Points,y2Points,3);
        gc.strokePolygon(x2Points,y2Points,3);
        gc.strokePolygon(xPoints,yPoints,3);
    }

    @Override
    public void move() {
        x += xSpeed;
        y += ySpeed;

        if (x + 120 > gc.getCanvas().getWidth()) {
            xSpeed = -xSpeed;
        }

        if (y + 120 > gc.getCanvas().getHeight()) {
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
