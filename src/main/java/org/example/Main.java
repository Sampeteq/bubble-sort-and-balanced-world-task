package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var r = new BubbleSort().sort(List.of(5, 3, 6, 1));
        r.forEach(System.out::println);
    }
}