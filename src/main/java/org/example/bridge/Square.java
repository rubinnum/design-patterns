package org.example.bridge;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    void describe() {
        System.out.println("I'm a square");
    }
}
