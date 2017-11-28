package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverege(int[] numbers){

        IntStream.rangeClosed(numbers[0],numbers[19])
                .map(n->numbers[n])
                .forEach(System.out::println);

        double average =IntStream.rangeClosed(numbers[0],numbers[19])
                .map(n->numbers[n])
                .average()
                .getAsDouble();

        return average;

    }

}
