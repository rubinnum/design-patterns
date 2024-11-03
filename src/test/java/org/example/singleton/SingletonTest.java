package org.example.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SingletonTest {
    @Test
    void shouldCreateNewInstance() {
        Singleton firstInstance = Singleton.getInstance("first instance");
        Singleton secondInstance = Singleton.getInstance("second instance");

        Assertions.assertEquals(firstInstance.getData(), secondInstance.getData());
    }
}