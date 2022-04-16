package com.example.simplewidget.data;

import edu.wpi.first.shuffleboard.api.data.ComplexData;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.util.Map;

public final class ShooterIndex extends ComplexData<ShooterIndex> {
    private final double index;
    private final double fontSize;

    // Constructor should take all the different fields needed and assign them their
    // corresponding instance variables.
    public ShooterIndex(double index, double fontSize) {
        this.index = index;
        this.fontSize = fontSize;
    }

    public ShooterIndex setIndex(double index) {
        return new ShooterIndex(index, fontSize);
    }

    public ShooterIndex setFontSize(double size) {
        return new ShooterIndex(index, size);
    }

    public double getFontSize() {
        return fontSize;
    }

    public Font getFont() {
        return new Font(fontSize);
    }

    @Override
    public String toHumanReadableString() {
        return Double.toString(index);
    }

    @Override
    public Map<String, Object> asMap() {
        return Map.of("index", index);
    }
}
