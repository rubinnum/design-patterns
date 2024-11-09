package org.example.prototype;

public class Car extends Vehicle {
    private final int topSpeed;

    public Car(String brand, String model, String color, int topSpeed) {
        super(brand, model, color);
        this.topSpeed = topSpeed;
    }

    protected Car(Car anotherCar) {
        super(anotherCar);
        this.topSpeed = anotherCar.topSpeed;
    }

    @Override
    public Car clone() {
        return new Car(this);
    }
}
