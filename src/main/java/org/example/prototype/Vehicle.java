package org.example.prototype;

import java.util.Objects;

public abstract class Vehicle {
    private final String brand;
    private final String model;
    private final String color;

    public Vehicle(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    protected Vehicle(Vehicle anotherVehicle) {
        this.brand = anotherVehicle.brand;
        this.model = anotherVehicle.model;
        this.color = anotherVehicle.color;
    }

    public abstract Vehicle clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(brand, vehicle.brand) && Objects.equals(model, vehicle.model) && Objects.equals(color, vehicle.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color);
    }
}
