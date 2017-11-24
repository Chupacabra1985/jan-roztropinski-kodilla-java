package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverege(int[] numbers){

        double average =IntStream.rangeClosed(numbers[0],numbers[19])
                .average()
                .getAsDouble();

        return average;

    }

}
