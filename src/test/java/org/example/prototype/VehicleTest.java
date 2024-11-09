package org.example.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void shouldCloneCar() {
        Car ferrari = new Car("Ferrari", "Spider", "White", 200);
        Vehicle ferrariClone = ferrari.clone();
        assertEquals(ferrariClone, ferrari);
    }

    @Test
    void shouldCloneBus() {
        Bus schoolBus = new Bus("School", "Bohdan", "Yellow", 4);
        Vehicle schoolBusClone = schoolBus.clone();
        assertEquals(schoolBusClone, schoolBus);
    }
}