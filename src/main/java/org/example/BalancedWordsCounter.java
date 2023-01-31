package org.example;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class BalancedWordsCounter {

    public int count(String input) {
        if (input == null) {
            throw new IllegalArgumentException("An input cannot be null");
        }
        if (input.isEmpty()) {
            return 0;
        }
        if (!input.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Input must be a non-empty string of letters only");
        }
        return (int) IntStream.rangeClosed(1, input.length())
                .mapToLong(i -> IntStream.range(0, input.length() - i + 1)
                        .mapToObj(j -> input.substring(j, j + i))
                        .filter(this::isBalanced)
                        .count()
                ).sum();
    }

    private boolean isBalanced(String word) {
        Set<Integer> frequency = new HashSet<>();
        for (char c : word.toCharArray()) {
            frequency.add((int) word.chars().filter(ch -> ch == c).count());
        }
        return frequency.size() <= 1;
    }
}


