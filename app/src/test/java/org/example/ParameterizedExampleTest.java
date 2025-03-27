package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class ParameterizedExampleTest {

    @ParameterizedTest
    @CsvSource({
        "2, 3, 6",
        "-2, 3, -6",
        "0, 5, 0",
        "7, 7, 49"
    })
    void testMultiplication(int a, int b, int expected) {
        assertEquals(expected, App.multiply(a, b));
    }
}

