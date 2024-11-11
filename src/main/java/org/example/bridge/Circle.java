package org.example.bridge;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    void describe() {
        System.out.println("I'm a circle");
    }
}
