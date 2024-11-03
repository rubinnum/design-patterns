package org.example.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Singleton {
    private static final Logger logger = LoggerFactory.getLogger(Singleton.class);

    private static volatile Singleton instance;
    private String data;

    private Singleton(String data) {
        this.data = data;
        logger.info ("Singleton instance created with data: {}", data);
    }

    public static Singleton getInstance(String data) {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton(data);
                }
            }
        }
        return instance;
    }

    public String getData() {
        return data;
    }
}
