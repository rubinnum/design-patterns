package org.example.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void shouldBuildCar() {
        // Given
        Car car = new Car("Bugatti", "Blue", 2, 115);

        // When
        Car actualCar = new Car.CarBuilder()
                .brand("Bugatti")
                .color("Blue")
                .doorsNumber(2)
                .height(115)
                .build();

        // Then
        assertEquals(car, actualCar);
    }
}