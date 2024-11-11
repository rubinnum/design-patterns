package org.example.composite;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {
    @Test
    void shouldCalculatePrice() {
        CompositeBox compositeBox = new CompositeBox(
                List.of(
                    new CompositeBox(
                            List.of(
                                    new Product("Video Game", 200),
                                    new Product("Book", 50)
                            )

                    ),
                    new CompositeBox(
                            List.of(
                                    new Product("Journal", 20),
                                    new Product("Newspaper", 10)
                            )

                    )
                )
        );
        assertEquals(2, compositeBox.getChildren().size());
        assertEquals(280, compositeBox.calculatePrice());
    }
}