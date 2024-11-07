package org.example.builder;

import java.util.Objects;

public class Car {
    private final String brand;
    private final String color;
    private final int doorsNumber;
    private final int height;

    Car(String brand, String color, int doorsNumber, int height) {
        this.brand = brand;
        this.color = color;
        this.doorsNumber = doorsNumber;
        this.height = height;
    }

    public static class CarBuilder {
        private String brand;
        private String color;
        private int doorsNumber;
        private int height;

        public CarBuilder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder color(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder doorsNumber(int doorsNumber) {
            this.doorsNumber = doorsNumber;
            return this;
        }

        public CarBuilder height(int height) {
            this.height = height;
            return this;
        }

        public Car build() {
            return new Car(this.brand, this.color, this.doorsNumber, this.height);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return doorsNumber == car.doorsNumber && height == car.height && Objects.equals(brand, car.brand) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, color, doorsNumber, height);
    }

}
