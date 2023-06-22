package org.example.app;

import java.util.List;
import java.util.OptionalDouble;

public class Average {

    public static double averageValue(List<Integer> numbers) {
        OptionalDouble average = numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average();

        if (average.isPresent()) {
            return average.getAsDouble();
        } else {
            return 0;
        }
    }
}
