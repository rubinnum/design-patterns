package org.example.bridge;

public class BlueColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Drawing in  blue...");
    }

    @Override
    public ColorName describeColor() {
        return ColorName.BLUE;
    }
}
