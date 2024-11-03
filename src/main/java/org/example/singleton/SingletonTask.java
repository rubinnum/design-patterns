package org.example.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SingletonTask implements Runnable {
    private static final Logger logger = LoggerFactory.getLogger(SingletonTask.class);

    private String data;
    public SingletonTask(String data) {
        this.data = data;
    }

    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance(data);

        logger.info("Thread {} got Singleton instance with data: {}", Thread.currentThread().getName(), singleton.getData());
    }
}
