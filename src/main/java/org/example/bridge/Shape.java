package org.example.bridge;

public abstract class Shape {
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract void describe();

    public void draw() {
        color.applyColor();
    }

    public Color getColor() {
        return color;
    }
}
