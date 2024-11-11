package org.example.adapter;

import org.example.adapter.formats.JsonData;
import org.example.adapter.formats.XmlData;

// Adapter
public class FancyDisplayedAdapter implements Displayer {
    private final FancyDisplayer fancyDisplayer;

    public FancyDisplayedAdapter(FancyDisplayer fancyDisplayer) {
        this.fancyDisplayer = fancyDisplayer;
    }

    @Override
    public void displayData(XmlData xmlData) {
        JsonData jsonData = convertXmlData(xmlData);
        fancyDisplayer.displayData(jsonData);
    }

    private JsonData convertXmlData(XmlData xmlData) {
        // convert xmlData to jsonData
        return new JsonData();
    }
}
