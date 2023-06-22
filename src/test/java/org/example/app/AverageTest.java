package org.example.app;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AverageTest {

    @Test
    void averageValue() {
            List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
            double expectedAverage = 5.5;
            double actualAverage = Average.averageValue(numbers);
            assertEquals(expectedAverage, actualAverage);
    }
    @Test
    void averageValueOne() {
            List<Integer> numbers = List.of();
            double expectedAverage = 0.0;
            double actualAverage = Average.averageValue(numbers);
            assertEquals(expectedAverage, actualAverage);
    }
    @Test
    void averageValueTow() {
            List<Integer> numbers = List.of(5);
            double expectedAverage = 5;
            double actualAverage = Average.averageValue(numbers);
            assertEquals(expectedAverage, actualAverage);
    }
}