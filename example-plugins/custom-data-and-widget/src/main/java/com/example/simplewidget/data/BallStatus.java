package com.example.simplewidget.data;

import edu.wpi.first.shuffleboard.api.data.ComplexData;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

import java.util.Map;

/**
 * Represents a single point in two-dimensional space.
 */
public final class BallStatus extends ComplexData<BallStatus> {
    private final boolean hasRed;
    private final boolean hasBlue;
    private final boolean hasBall;

    // Constructor should take all the different fields needed and assign them their
    // corresponding instance variables.
    public BallStatus(boolean hasRed, boolean hasBlue, boolean hasBall) {
        this.hasRed = hasRed;
        this.hasBlue = hasBlue;
        this.hasBall = hasBall;
    }

    public BallStatus setRed(boolean has) {
        return new BallStatus(has, hasBlue, hasBall);
    }

    public BallStatus setBlue(boolean has) {
        return new BallStatus(hasRed, has, hasBall);
    }

    public BallStatus setBall(boolean has) {
        return new BallStatus(hasRed, hasBlue, has);
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
