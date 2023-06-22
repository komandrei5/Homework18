package org.example.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FilterLowerCaseLengthFourTest {

    @Test
    void filter() {
        List<String> input = Arrays.asList("one", "two", "Three", "four", "Five");
        List<String> expected = Arrays.asList("four");

        List<String> result = FilterLowerCaseLengthFour.filter(input);

        Assertions.assertEquals(expected, result);
    }
}