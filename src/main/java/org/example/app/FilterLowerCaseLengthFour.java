package org.example.app;

import java.util.ArrayList;
import java.util.List;

public class FilterLowerCaseLengthFour {
    public static List<String> filter(List<String> strings) {
        List<String> result = new ArrayList<>();
        strings.stream()
                .filter(s -> s.length() == 4 && s.equals(s.toLowerCase()))
                .forEach(result::add);
        return result;
    }
}
