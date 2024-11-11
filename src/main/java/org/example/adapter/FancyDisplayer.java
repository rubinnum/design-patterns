package org.example.adapter;

import org.example.adapter.formats.JsonData;

// Adaptee
public class FancyDisplayer {
    public void displayData(JsonData jsonData) {
        System.out.println("Displaying data using JSON format...");
    }
}
