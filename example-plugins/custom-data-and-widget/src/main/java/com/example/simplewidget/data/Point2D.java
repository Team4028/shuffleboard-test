package com.example.simplewidget.data;

import edu.wpi.first.shuffleboard.api.data.ComplexData;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

import java.util.Map;

/**
 * Represents a single point in two-dimensional space.
 */
public final class Point2D extends ComplexData<Point2D> {
    private final boolean hasRed;
    private final boolean hasBlue;
    private final boolean hasBall;

    // Constructor should take all the different fields needed and assign them their
    // corresponding instance variables.
    public Point2D(boolean hasRed, boolean hasBlue, boolean hasBall) {
        this.hasRed = hasRed;
        this.hasBlue = hasBlue;
        this.hasBall = hasBall;
    }

    public Point2D setRed(boolean has) {
        return new Point2D(has, hasBlue, hasBall);
    }

    public Point2D setBlue(boolean has) {
        return new Point2D(hasRed, has, hasBall);
    }

    public Point2D setBall(boolean has) {
        return new Point2D(hasRed, hasBlue, has);
    }

    public boolean getRed() {
        return hasRed;
    }

    public boolean getBlue() {
        return hasBlue;
    }

    public boolean getBall() {
        return hasBall;
    }

    public Paint getColor() {
        if (hasRed) {
            return Color.RED;
        } else if (hasBlue) {
            return Color.BLUE;
        } else if (hasBall) {
            return Color.WHITE;
        } else {
            return Color.BLACK;
        }
    }

    @Override
    public String toHumanReadableString() {
        return getColor().toString();
    }

    @Override
    public Map<String, Object> asMap() {
        return Map.of("hasRed", hasRed, "hasBlue", hasBlue, "hasBall", hasBall);
    }
}
