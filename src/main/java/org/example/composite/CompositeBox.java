package org.example.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeBox implements Item {
    private final List<Item> children = new ArrayList<>();

    CompositeBox(List<Item> boxes) {
        children.addAll(boxes);
    }

    @Override
    public double calculatePrice() {
        return children
                .stream()
                .mapToDouble(Item::calculatePrice)
                .sum();
    }

    public List<Item> getChildren() {
        return children;
    }
}
