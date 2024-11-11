package org.example.adapter;

import org.example.adapter.formats.XmlData;

// Client
public class InternalDisplayer implements Displayer {
    @Override
    public void displayData(XmlData xmlData) {
        System.out.println("Displaying data using XML format...");
    }
}
