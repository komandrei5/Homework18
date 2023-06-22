package org.example.app;

import java.util.List;
import java.util.stream.Collectors;

public class Uppercase {
     public static List<Pair> uppercase(List<String> strings) {
        return strings.stream()
                .map(s -> new Pair(s, s.toUpperCase()))
                .collect(Collectors.toList());
    }
}
