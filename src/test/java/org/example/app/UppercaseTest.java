package org.example.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class UppercaseTest {

    @Test
    void testUppercase() {
        List<String> input = List.of("one", "two", "three");
        List<Pair> expected = Arrays.asList(
                new Pair("one", "ONE"),
                new Pair("two", "TWO"),
                new Pair("three", "THREE")
        );

        List<Pair> result = Uppercase.uppercase(input);

        Assertions.assertEquals(expected, result);

    }
}