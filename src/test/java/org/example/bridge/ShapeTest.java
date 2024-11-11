package org.example.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void shouldBeBlueSquare() {
        Shape square = new Square(new BlueColor());
        assertEquals(ColorName.BLUE, square.getColor().describeColor());
    }

    @Test
    void shouldBeRedCircle() {
        Shape circle = new Circle(new RedColor());
        assertEquals(ColorName.RED, circle.getColor().describeColor());
    }
}