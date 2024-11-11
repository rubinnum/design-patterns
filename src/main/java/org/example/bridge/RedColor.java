package org.example.bridge;

public class RedColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Drawing in red...");
    }

    @Override
    public ColorName describeColor() {
        return ColorName.RED;
    }
}
