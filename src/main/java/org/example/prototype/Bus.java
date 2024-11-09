package org.example.prototype;

public class Bus extends Vehicle {
    private final int wheels;

    public Bus(String brand, String model, String color, int wheels) {
        super(brand, model, color);
        this.wheels = wheels;
    }

    protected Bus(Bus anotherBus) {
        super(anotherBus);
        this.wheels = anotherBus.wheels;
    }

    @Override
    public Bus clone() {
        return new Bus(this);
    }
}
