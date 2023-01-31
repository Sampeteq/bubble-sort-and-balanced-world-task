package org.example;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class BubbleSort {

    public <T extends Comparable<T>> List<T> sort(List<T> input) {
        if (input == null) {
            throw new IllegalArgumentException("An input cannot be null");
        }
        if (input.isEmpty()) {
            return input;
        }
        input = input.stream().filter(Objects::nonNull).collect(Collectors.toList());
        int n = input.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (input.get(j).compareTo(input.get(j + 1)) > 0) {
                    Collections.swap(input, j, j + 1);
                }
            }
        }
        return input;
    }
}

